package com.spring.bbsCommand;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.spring.bbsDAO.BDAO;
import com.spring.bbsVO.BVO;

public class ListCmd implements Bcmd {


	@Override
	public void service(Model model) {
		BDAO dao = new BDAO();
		ArrayList<BVO> bVOs = dao.list();
		model.addAttribute("list", bVOs);
	}

}
