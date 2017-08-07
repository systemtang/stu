package com.foresealife.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.foresealife.entity.Student;
import com.foresealife.service.StuService;

@Controller
@RequestMapping("/")
public class StuController {

	@Autowired
	public StuService stuService;
	
	@RequestMapping("getStu")
	public ModelAndView getStu() {
		Student stu = new Student();
		stu.setId(1l);
		stu.setName("xin");
		stu.setSex(true);
		stu.setStuNum("10050141");
//		Student stu = stuService.getStu(1l);
		Map<String, Student> map = new HashMap<String, Student>();
		map.put("stu", stu);
		return new ModelAndView("index", map);
	} 
 	
}
