package com.sample.mybatis;

import java.util.List;

public interface BoardMapper {

	public List<ZipcodeVO>	getZipcodeList(String area) throws Exception;
	
	void registUser(UserVO userVO) throws Exception;
	UserVO getUser(UserVO userVO) throws Exception;
	int getCash(String name) throws Exception;
	int getBank(String name) throws Exception;
	void minuscash(String name) throws Exception;
	void plusbank(String name) throws Exception;
	
}
