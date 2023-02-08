package com.myboot01.board.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myboot01.board.dao.BoardDAO;
import com.myboot01.board.vo.ArticleVO;



@Service("boardService")
@Transactional(propagation = Propagation.REQUIRED)
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public List<ArticleVO> listBoards()throws Exception{
		List<ArticleVO> boarList = boardDAO.selectAllBoardList();
		return boarList;
	}
	@Override
	public int addNewArticle(Map articleMap)throws Exception{
		int articleNO = boardDAO.selectNewArticleNO();
		articleMap.put("articleNO", articleNO);
		return boardDAO.insertNewArticle(articleMap);
	}
	@Override
	public ArticleVO viewArticle(int articleNO)throws Exception{
		ArticleVO articleVO = boardDAO.selectArticle(articleNO);
		return articleVO;
	}
	@Override
	public void removeArticle(int articleNO)throws Exception{
		boardDAO.deleteArticle(articleNO);
	}
	@Override
	public void modArticle(Map articleMap)throws Exception{
		boardDAO.updateArticle(articleMap);
	}
	
}
