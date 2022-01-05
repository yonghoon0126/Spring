package com.sample.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/rest")
public class RestController {
	// /rest/1 --> ��û�ϸ� int no�� ���� ��
	// �׷��� ���� �������̾����. {no} = int no

	@RequestMapping("/{no}")
	public String res(@PathVariable int no, Model model) {
		model.addAttribute("msg",no + "������ ���");
		return "/rest/rest";	// views/rest/rest.jsp
	}

	@RequestMapping("/{no}/{action}")	// /rest/1/action
	public String rest(@PathVariable int no, @PathVariable String action, Model model) {
		
		String msg = "";
		
		if(action.equals("i") || action.equals("put")) {
			msg=no+"�� �Խù��� �Է��մϴ�."+action;
		
		}else if(action.equals("s") || action.equals("get") || action.equals("post")) {
			msg=no+"�� �Խù��� ��ȸ�մϴ�."+action;
		
		}else if(action.equals("d") || action.equals("delete")) {
			msg=no+"�� �Խù��� �����մϴ�."+action;
		
		}else if(action.equals("u")) {
			msg=no+"�� �Խù��� �����մϴ�."+action;
		
		}else {
			msg="�׼� ���� error..."+action;
		}
		
		model.addAttribute("msg",msg);
		return "/rest/rest";	// views/rest/rest.jsp
	}
	
	// http://localhost:8081/mvc/rest/action
	@RequestMapping(value="/action",method=RequestMethod.GET)
	public void get1(Model model) {
		model.addAttribute("action","action...");
		System.out.println("GET����Դϴ�.");

	}
}
