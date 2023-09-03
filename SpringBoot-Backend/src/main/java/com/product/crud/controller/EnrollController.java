package com.product.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.crud.model.Enroll;
import com.product.crud.services.EnrollService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EnrollController {
	@Autowired
	private EnrollService service;
	//private IsearchService service;
	
	@RequestMapping(path="/enrolldata/{id}/{course_name}/{course_des}/{course_fees}/{username}/{image}/{cfile}",method=RequestMethod.POST)
	public String fetchProductList(@PathVariable String id,@PathVariable String course_name,@PathVariable String course_des,@PathVariable String course_fees,@PathVariable String username,@PathVariable String image,@PathVariable String cfile)
	{
		
		service.enrollcourse(id,course_name, course_des, course_fees,username,image,cfile);
		return "success";
		
		
	}
	
	
}
