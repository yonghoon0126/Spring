package com.sample.mybatis;

import java.util.List;

public interface BoardService {

	void register(BoardVO board);
	BoardVO get(Long no);
	
	boolean modify(BoardVO board);
	boolean remove(Long no);
	List<BoardVO> getList();

}
