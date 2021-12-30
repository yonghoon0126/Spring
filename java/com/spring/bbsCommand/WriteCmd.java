package com.spring.bbsCommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.spring.bbsDAO.BDAO;

public class WriteCmd implements Bcmd {

	@Override
	public void service(Model model) {
		
		Map<String, Object> map  = model.asMap();
		
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		String bName = request.getParameter("bName");		
		String bSubject = request.getParameter("bSubject");
		String bContent = request.getParameter("bContent");
		
		BDAO dao = new BDAO();
		dao.write(bName, bSubject, bContent);		
	}
}
