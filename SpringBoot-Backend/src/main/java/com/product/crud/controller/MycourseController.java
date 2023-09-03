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
import com.product.crud.services.MycourseService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MycourseController {
	@Autowired
	private MycourseService service;
	//private IsearchService service;
	
	@RequestMapping(path="/searchmycourse/{username}",method=RequestMethod.GET)
	public List<Enroll> fetchcourseList(@PathVariable String username)
	{
		List<Enroll> items=new ArrayList<Enroll>();
		items=service.fetchCourseList(username);
		
		return items;
	}
}