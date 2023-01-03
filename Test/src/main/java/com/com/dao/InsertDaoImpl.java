package com.com.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.com.domain.OracleInsertDTO;
import com.com.domain.PostgreInsertDTO;
import com.com.domain.insertDTO;


@Repository
public class InsertDaoImpl implements InsertDao {

	
	
	@Resource(name = "sqlSession")
	private SqlSession sql;
	
	@Resource(name = "sqlSession2")
	private SqlSession sql2;
	
	@Resource(name = "sqlSession3")
	private SqlSession sql3;
	
	private static final String NAMESPACE="com.com.mapper.Mapper";
	
	
	@Override
	public void insert(insertDTO dto) throws Exception {
		sql.insert(NAMESPACE+".insert",dto);

	}


	@Override
	public String view(String userId) throws Exception {
		System.out.println("userId먼데 ? "  + userId);
		String result = sql.selectOne(NAMESPACE+".view", userId);
		return result;
	}

	@Override
	public void oracleInsert(OracleInsertDTO dto) throws Exception {
		sql2.insert(NAMESPACE+".oracleInsert",dto);
	}


	@Override
	public void postgresInsert(PostgreInsertDTO dto) throws Exception {
		sql3.insert(NAMESPACE+".postgresInsert",dto);
	}

}
