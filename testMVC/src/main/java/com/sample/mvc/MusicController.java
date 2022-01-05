package com.sample.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	// 	/music/rock
@RequestMapping("/music")
public class MusicController {

	@RequestMapping("/rock")
	public void rock(Model model) {
		model.addAttribute("msg", "We will rock...");
	}
		
	@RequestMapping(value="/funk")
	public void funk(Model model) {
		model.addAttribute("msg", "We will funk...");
	}
	
	@RequestMapping(value="/jazz")
	public void jazz(Model model) {
		model.addAttribute("msg", "We will jazz...");
	}
	
	@RequestMapping(value="/classic")
	public void classic(Model model) {
		model.addAttribute("msg", "We will classic...");
	}
}
