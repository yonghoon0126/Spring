package com.sample.mybatis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

	@Autowired	// (required=true)기본, 타입으로 자동 주입, @Qualifier(value="빈이름") ==@Inject
	private BoardService boardService;
	
	@RequestMapping
	private ModelAndView board(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board");
		return mv;
	}
	
	@RequestMapping("/list")
	public void list(Model model) {
		model.addAttribute("list",boardService.getList());
	}
	
	
}
