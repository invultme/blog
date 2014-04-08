package com.soo.web.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soo.web.dao.CommonDao;

@Service("boardService")
public class boardServiceImpl implements boardService {
	
	@Autowired
	private CommonDao CommonDao;
	
	
	public ArrayList<HashMap<String, Object>> boardListInfo(HashMap<String, Object> map)
	{
		return (ArrayList<HashMap<String, Object>>) CommonDao.selectList("member.getMemberList", map);
	
	}
	
	public void insertBoardInfo(HashMap<String, Object> map)
	{	
		CommonDao.insertItem( "BoardList.insertBoardInfo", map);
	}
	
	public HashMap<String, Object> rowCountInfo(HashMap<String, Object> map)
	{
		return (HashMap<String, Object>) CommonDao.selectItem("BoardList.rowCountInfo", map);
	}
	public HashMap<String, Object> boardSubInfo(HashMap<String, Object> map)
	{	
		return (HashMap<String, Object>) CommonDao.selectItem("BoardList.boardSubInfo", map);
	}
	public ArrayList<HashMap<String, Object>> replylistInfo(HashMap<String, Object> map)
	{	
		return (ArrayList<HashMap<String, Object>>) CommonDao.selectList( "BoardList.replylistInfo", map);
	}
	public void replyInsertInfo(HashMap<String, Object> map)
	{
		CommonDao.insertItem("BoardList.replyInsertInfo", map);
	
	}
	public void reDeletInfo(HashMap<String, Object> map)
	{
		CommonDao.deleteItem("BoardList.reDeletInfo", map);
	}
}

