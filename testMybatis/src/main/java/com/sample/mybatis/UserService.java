package com.sample.mybatis;

import java.util.List;

public interface UserService {

	List<ZipcodeVO> getZipcodeList(String area) throws Exception;
	
	void	registUser(UserVO userVO) throws Exception;
	UserVO	getUser(UserVO userVO) throws Exception;
	int		getCash(String string) throws Exception;
	int		getBank(String string) throws Exception;
	void	deposit(String string) throws Exception;
	
	
	
}
