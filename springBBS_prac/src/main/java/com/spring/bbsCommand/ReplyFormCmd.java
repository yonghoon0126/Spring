package com.spring.bbsCommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.spring.bbsDAO.BDAO2;
import com.spring.bbsVO.BVO;

public class ReplyFormCmd implements Bcmd {
	@Override
	public void service(Model model) {
		
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		String bNo = request.getParameter("bNo");
		
		BDAO2 bDAO = new BDAO2();
		BVO bVO = bDAO.replyForm(bNo);
		
		model.addAttribute("replyForm", bVO);
	}
}
