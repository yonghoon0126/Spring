package com.spring.bbsCommand;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.spring.bbsDAO.BDAO2;
import com.spring.bbsVO.BVO;

public class ContentCmd implements Bcmd {

	@Override
	public void service(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		String bNo = request.getParameter("bNo");
		
		BDAO2 dao = new BDAO2();
		BVO bVo = dao.contentView(bNo);
		
		model.addAttribute("contentView", bVo);		
	}

}
