package com.soo.web.dao;

import java.util.HashMap;
import java.util.List;

public interface CommonDao
{
	/**
	 * 데이터 조회 - 1 row
	 * @param statmentName
	 * @param conditions
	 * @return
	 */
	public HashMap selectItem(String statementName, HashMap conditions);

	/**
	 * 데이터 조회 - Multi row
	 * @param statmentName
	 * @param conditions
	 * @return
	 */
	public List selectList(String statementName, HashMap conditions);

	/**
	 * 데이터 입력
	 * @param statementName
	 * @param conditons
	 */
	public void insertItem(String statementName, HashMap conditions);

	/**
	 * 데이터 수정
	 * @param statementName
	 * @param conditons
	 */
	public void updateItem(String statementName, HashMap conditions);

	/**
	 * 데이터 삭제
	 * @param statmentName
	 * @param conditions
	 */
	public void deleteItem(String statementName, HashMap conditions);
}
