package com.suman.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suman.DTO.StudentDTO;
import com.suman.model.DAO.StudentDAO;

@Service
public class StudentService {

	@Autowired
	private StudentDAO dao;
	
	public StudentDTO getService(String id) {
		return dao.getInfo(id);
	}

	
}
