package com.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.dao.MemberDao;
import com.com.domain.PostgreInsertDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao dao;
	
	@Override
	public PostgreInsertDTO login(PostgreInsertDTO dto) throws Exception {
		
		PostgreInsertDTO result = dao.login(dto);
		return result;
		

	}

}
