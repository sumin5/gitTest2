package com.com.service;

import com.com.domain.OracleInsertDTO;
import com.com.domain.PostgreInsertDTO;
import com.com.domain.insertDTO;

public interface InsertService {
	public void insert(insertDTO dto) throws Exception;

	public String view(String userId)throws Exception;

	public void oracleInsert(OracleInsertDTO dto)throws Exception;

	public void postgresInsert(PostgreInsertDTO dto)throws Exception;
	
	
}
