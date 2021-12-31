package com.spring.bbsCommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.spring.bbsDAO.BDAO;

public class ModifyCmd implements Bcmd {
	
	@Override
	public void service(Model model){
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		String bNo = request.getParameter("bNo");
		String bName = request.getParameter("bName");
		String bSubject = request.getParameter("bSubject");
		String bContent = request.getParameter("bContent");
		
		BDAO bDAO = new BDAO();
		bDAO.modify(bNo, bName, bSubject, bContent);
	}
}
