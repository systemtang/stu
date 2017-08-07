package com.foresealife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	public String test(){
		return "test";
	}
	
	@RequestMapping("/resetPwdForAdmin")
	public String resetPwdForAdmin(){
		return "resetPwdForAdmin";
	}
	
	@RequestMapping("/teacherblank")
	public String teacherblank(){
		return "teacher/teacher_blank";
	}
	
	@RequestMapping("/adminblank")
	public String adminblank(){
		return "admin/admin_blank";
	}
	
	@RequestMapping("/adminlogin")
	public String adminlogin(){
		return "admin/admin_login";
	}
}
