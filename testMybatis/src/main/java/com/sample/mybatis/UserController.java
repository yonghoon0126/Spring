package com.sample.mybatis;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//		Apache Commons : Codec 을 찾아 pom.xml에 넣는다
//		암호화 하는 기술

@Controller
@RequestMapping("/user") // user/login
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired // 자동 주입
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void login() {
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginAction(UserVO userVO, Model model, HttpSession session) throws Exception {
		logger.info("☆☆☆☆☆☆☆ loginAction start ☆☆☆☆☆☆☆");
		userVO.setUser_pwd(DigestUtils.md5Hex(userVO.getUser_pwd()));

		try {
			UserVO userInfo = userService.getUser(userVO);
			session.setAttribute("user_id", userInfo.getUser_id());
			session.setAttribute("user_name", userInfo.getUser_name());

			model.addAttribute("msg", "로그인 성공");
			model.addAttribute("url", "../board");

		} catch (Exception e) {
			model.addAttribute("msg", "아이디 혹은 비밀번호가 틀립니다");
			model.addAttribute("url", "login");
		}

		logger.info("☆☆☆☆ loginAction end ☆☆☆☆");
		return "user/result";
	}

	@RequestMapping(value = "/regist", method = RequestMethod.GET)
	public void regist() {
	}

	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public String registAction(

			// javax.validation.Valid 검증대상이 UserVo
			@Valid UserVO userVO, BindingResult br, // 검증하고나서 결과를 저장
			HttpServletRequest request, Model model) throws Exception {

		logger.info("userVO : " + userVO);

		model.addAttribute("userVO", userVO);

		// 비번을 16진수 체계로 암호화함
		userVO.setUser_pwd(DigestUtils.md5Hex(userVO.getUser_pwd()));

		if (br.hasErrors()) {
			return "user/regist";
		}

		userVO.setUser_lastip(request.getRemoteAddr());
		userService.registUser(userVO);

		return "user/registAction";
	}

	@RequestMapping(value = "/zipcode", method = RequestMethod.GET)
	public void zipcode() {
	}

	@RequestMapping(value = "/zipcode", method = RequestMethod.POST)
	public void zipcode(String area, Model model) throws Exception {
		logger.info("동: " + area);
		List<ZipcodeVO> list = userService.getZipcodeList(area);

		model.addAttribute("list", list);
	}

	@RequestMapping(value = "/account")
	public void account(Model model) {
		int cash = 0;
		int bank = 0;

		try {
			userService.deposit("홍길동");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			cash = userService.getCash("홍길동");
			bank = userService.getBank("홍길동");
		} catch (Exception e) {
			e.printStackTrace();
		}

		model.addAttribute("cash", cash);
		model.addAttribute("bank", bank);

	}

}
