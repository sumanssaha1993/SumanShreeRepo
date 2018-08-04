package com.suman.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suman.DTO.StudentDTO;
import com.suman.model.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@RequestMapping(value = "/getname/{id}", method = RequestMethod.POST)
	public List<String> getStudent(@PathVariable("id") String id){
		List<String> list = new ArrayList<String>();
		StudentDTO student = service.getService(id);
		list.add(student.getStd_id());
		list.add(student.getStd_name());
		list.add(student.getStd_address());
		return list;
	}
}
