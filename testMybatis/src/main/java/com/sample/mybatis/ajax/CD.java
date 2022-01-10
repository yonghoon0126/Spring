package com.sample.mybatis.ajax;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="cd")
public class CD {

	private String singer;
	private String title;
	private int price;

	public CD() {
	}

	public CD(String singer, String title, int price) {
		this.singer = singer;
		this.title = title;
		this.price = price;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CD [singer=" + singer + ", title=" + title + ", price=" + price + "]";
	}

}
