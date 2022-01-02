package com.spring.bbsCommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.spring.bbsDAO.BDAO2;

public class ReplyCmd implements Bcmd {

	@Override
	public void service(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		String bNo = request.getParameter("bNo");
		String bName = request.getParameter("bName");
		String bSubject = request.getParameter("bSubject");
		String bContent = request.getParameter("bContent");
		String bGroup = request.getParameter("bGroup");
		String bStep = request.getParameter("bStep");
		String bIndent = request.getParameter("bIndent");
		
		BDAO2 bDAO = new BDAO2();
		bDAO.replyOk(bNo, bName, bSubject, bContent, bGroup, bStep, bIndent);
	}

}
