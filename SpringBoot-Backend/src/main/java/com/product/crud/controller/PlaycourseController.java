package com.product.crud.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.crud.model.Course;
import com.product.crud.services.PlaycourseService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PlaycourseController {
	@Autowired
	private PlaycourseService service;
	//private IsearchService service;
	
	@RequestMapping(path="/playresource/{id}",method=RequestMethod.GET)
	public List<Course> fetchcourse(@PathVariable String id)
	{
		List<Course> items=new ArrayList<Course>();
		items=service.fetchcourse(id);
		
		return items;
	}
}