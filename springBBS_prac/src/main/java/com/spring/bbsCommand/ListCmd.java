package com.spring.bbsCommand;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.spring.bbsDAO.BDAO2;
import com.spring.bbsVO.BVO;

public class ListCmd implements Bcmd {


	@Override
	public void service(Model model) {
		BDAO2 dao = new BDAO2();
		ArrayList<BVO> bVOs = dao.list();
		model.addAttribute("list", bVOs);
	}

}
