package com.sample.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/rest")
public class RestController {
	// /rest/1 --> 요청하면 int no에 값이 들어감
	// 그래서 같은 변수명이어야함. {no} = int no

	@RequestMapping("/{no}")
	public String res(@PathVariable int no, Model model) {
		model.addAttribute("msg",no + "페이지 출력");
		return "/rest/rest";	// views/rest/rest.jsp
	}

	@RequestMapping("/{no}/{action}")	// /rest/1/action
	public String rest(@PathVariable int no, @PathVariable String action, Model model) {
		
		String msg = "";
		
		if(action.equals("i") || action.equals("put")) {
			msg=no+"번 게시물을 입력합니다."+action;
		
		}else if(action.equals("s") || action.equals("get") || action.equals("post")) {
			msg=no+"번 게시물을 조회합니다."+action;
		
		}else if(action.equals("d") || action.equals("delete")) {
			msg=no+"번 게시물을 삭제합니다."+action;
		
		}else if(action.equals("u")) {
			msg=no+"번 게시물을 수정합니다."+action;
		
		}else {
			msg="액션 지정 error..."+action;
		}
		
		model.addAttribute("msg",msg);
		return "/rest/rest";	// views/rest/rest.jsp
	}
	
	// http://localhost:8081/mvc/rest/action
	@RequestMapping(value="/action",method=RequestMethod.GET)
	public void get1(Model model) {
		model.addAttribute("action","action...");
		System.out.println("GET방식입니다.");

	}
}
