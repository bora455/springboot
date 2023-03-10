package com.myboot01.board.service;

import java.util.List;
import java.util.Map;

import com.myboot01.board.vo.ArticleVO;



public interface BoardService {
	public List<ArticleVO> listBoards() throws Exception;
	public int addNewArticle(Map articleMap) throws Exception;
	public ArticleVO viewArticle(int articleNO)throws Exception;
	public void removeArticle(int articleNO)throws Exception;
	public void modArticle(Map articleMap)throws Exception;
}
