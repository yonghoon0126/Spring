package com.sample.mybatis.ajax;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ajax") // /ajax/basketMember

public class AjaxController {

	private static Logger logger = LoggerFactory.getLogger(AjaxController.class);

	@RequestMapping("/basketMember")
	public void basketMember() {
	}

	// /ajax/basketMemberJSON
	@RequestMapping(value = "/basketMemberJSON")
	@ResponseBody
	public List<BasketMember> getBasketMemberJSON() {

		List<BasketMember> list = new ArrayList<BasketMember>();
		list.add(new BasketMember(10, "장영실", "조선최대의 과학자"));
		list.add(new BasketMember(11, "임꺽정", "조선최대의 도적"));
		list.add(new BasketMember(12, "서 희", "조선의 정상"));

		return list;
	}

	// /ajax/cdListXML
	@RequestMapping(value = "/cdListXML")
	@ResponseBody // 반환형이 String타입이거나 객체여야함 본문에 값을 전달
	public CDList getCDList() {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("text", "xml", Charset.forName("utf-8")));

		List<CD> list = new ArrayList<CD>();
		list.add(new CD("신해철", "Myself", 1000));
		list.add(new CD("넥스트", "The Being", 2000));
		list.add(new CD("레드제플린", "untitled", 3000));

		CDList cdlist = new CDList();
		cdlist.setList(list);

		return cdlist;

	}

}