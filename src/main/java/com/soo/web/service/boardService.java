package com.soo.web.service;

import java.util.ArrayList;
import java.util.HashMap;

public interface boardService {
	public ArrayList<HashMap<String, Object>> boardListInfo(HashMap<String, Object> map);
	
	public void insertBoardInfo(HashMap<String, Object> map);
	
	public HashMap<String, Object> rowCountInfo(HashMap<String, Object> map);
	
	public HashMap<String, Object> boardSubInfo(HashMap<String, Object>map);
	
	public ArrayList<HashMap<String, Object>> replylistInfo(HashMap<String, Object> map);

	public void replyInsertInfo(HashMap<String, Object> map);

	public void reDeletInfo(HashMap<String, Object> map);
}

	
