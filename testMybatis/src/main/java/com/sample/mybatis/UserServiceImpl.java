package com.sample.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{

	@Autowired	// 스프링에서 자동 주입, mapper(꼭 인터페이스 해야함)
	private BoardMapper boardMapper;
	
	
	
	@Override
	public List<ZipcodeVO> getZipcodeList(String area) throws Exception {
		return boardMapper.getZipcodeList(area);
	}

	@Override
	public void registUser(UserVO userVO) throws Exception {
		boardMapper.registUser(userVO);
		
	}

	@Override
	public UserVO getUser(UserVO userVO) throws Exception {
		UserVO userInfo=boardMapper.getUser(userVO);
		if(userInfo==null) {
			throw new RuntimeException();
		}
		return userInfo;
	}

	@Override
	public int getCash(String name) throws Exception {
		return boardMapper.getCash(name);
	}

	@Override
	public int getBank(String name) throws Exception {
		return boardMapper.getBank(name);
	}

	@Transactional	// pom.xml에서 allience, aspect, weaving, 스프링 transaction 찾아 넣어줌
	@Override	
	public void deposit(String name) throws Exception {
		boardMapper.minuscash(name);
		boardMapper.plusbank(name);
		
	}

	
	
}
