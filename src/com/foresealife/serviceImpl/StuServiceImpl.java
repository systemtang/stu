package com.foresealife.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foresealife.dao.StuMapper;
import com.foresealife.entity.Student;
import com.foresealife.service.StuService;
@Service
public class StuServiceImpl implements StuService{

	@Autowired
	private StuMapper stuMapper;
	
	
	public Student getStu(Long id) {
		
		return stuMapper.getStu(id);
	}

}
