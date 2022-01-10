package com.sample.mybatis.ajax;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="cdlist")
public class CDList {

	private List<CD> list;

	public List<CD> getList() {
		return list;
	}

	public void setList(List<CD> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "CDLIst [list=" + list + "]";
	}

}
