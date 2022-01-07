package com.sample.mybatis;

public class ZipcodeVO {

	private String zipcode;
	private String addr1;

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	@Override
	public String toString() {
		return "ZipcodeVO [zipcode=" + zipcode + ", addr1=" + addr1 + "]";
	}

}
