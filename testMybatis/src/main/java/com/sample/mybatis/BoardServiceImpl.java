package com.sample.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // biz logic
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void register(BoardVO board) {
		
	}

	@Override
	public BoardVO get(Long no) {
		
		return null;
	}

	@Override
	public boolean modify(BoardVO board) {

		return false;
	}

	@Override
	public boolean remove(Long no) {

		return false;
	}

	@Override
	public List<BoardVO> getList() {

		return null;
	}


}
