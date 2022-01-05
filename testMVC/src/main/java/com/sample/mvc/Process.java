package com.sample.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class Process extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String name = request.getParameter("name");
		String greeting = "¾È³çÇÏ¼¼¿ä. " + name + "¾¾";
		
		// String viewName, String modelName, Object modelObject
		return new ModelAndView("process","greeting",greeting);
	}

}
