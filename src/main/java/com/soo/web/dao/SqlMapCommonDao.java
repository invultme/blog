package com.soo.web.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("CommonDao")
public class SqlMapCommonDao extends SqlSessionDaoSupport implements CommonDao //SqlSessionDaoSupport    SqlMapClientDaoSupport
{
//	@Transactional(timeout=3,propagation=Propagation.REQUIRES_NEW)
	public void deleteItem(String statementName, HashMap conditions)
	{
		//getSqlMapClientTemplate().delete(statementName, conditions);
		getSqlSession().delete(statementName, conditions);
	}

//	@Transactional(timeout=3,propagation=Propagation.REQUIRES_NEW)
	public void insertItem(String statementName, HashMap conditions)
	{
		//getSqlMapClientTemplate().insert(statementName, conditions);
		getSqlSession().insert(statementName, conditions);
	}

//	@Transactional(readOnly=true)
	public HashMap selectItem(String statementName, HashMap conditions)
	{
		//return (HashMap)getSqlMapClientTemplate().queryForObject(statementName, conditions);
		return (HashMap)getSqlSession().selectList(statementName, conditions);
	}

//	@Transactional(readOnly=true)
	public List selectList(String statementName, HashMap conditions)
	{
		//return getSqlMapClientTemplate().queryForList(statementName, conditions);
		return getSqlSession().selectList(statementName, conditions);
	}

//	@Transactional(timeout=3,propagation=Propagation.REQUIRES_NEW)
	public void updateItem(String statementName, HashMap conditions)
	{
		//getSqlMapClientTemplate().update(statementName, conditions);
		getSqlSession().update(statementName, conditions);
	}
}
