package com.sample.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("hellocontroll");	// 뷰명 : hellocontroll.jsp
		
		// view/hellocontroll.jsp로 연결해서 msg를 출력 --> ${msg}
		mv.addObject("msg","hello Spring MVC...");	// 속성명, 속성값
		
		return mv;
	}

}
