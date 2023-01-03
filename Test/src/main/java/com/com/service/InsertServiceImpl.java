package com.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.dao.InsertDao;
import com.com.domain.OracleInsertDTO;
import com.com.domain.PostgreInsertDTO;
import com.com.domain.insertDTO;

@Service
public class InsertServiceImpl implements InsertService {

	@Autowired
	InsertDao dao;
	
	@Override
	public void insert(insertDTO dto) throws Exception {
		dao.insert(dto);

	}

	@Override
	public String view(String userId) throws Exception {
		
		String result = dao.view(userId);
		return result;
		
	}

	@Override
	public void oracleInsert(OracleInsertDTO dto) throws Exception {
		dao.oracleInsert(dto);
		
	}

	@Override
	public void postgresInsert(PostgreInsertDTO dto) throws Exception {
		dao.postgresInsert(dto);
	}

}
