package com.com.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.com.domain.PostgreInsertDTO;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Resource(name = "sqlSession3")
	private SqlSession sql3;
	
	private static final String NAMESPACE="com.com.mapper.Mapper";
	
	@Override
	public PostgreInsertDTO login(PostgreInsertDTO dto) throws Exception {
		PostgreInsertDTO result = sql3.selectOne(NAMESPACE+".login",dto);
		System.out.println("result는?" + result);
		return result;
	}

}
