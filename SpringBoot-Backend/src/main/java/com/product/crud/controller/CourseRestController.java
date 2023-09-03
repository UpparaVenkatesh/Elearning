package com.product.crud.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




import java.util.*;

import com.product.crud.model.Course;

import com.product.crud.services.CourseService;


@RestController
public class CourseRestController {

    @Autowired
	private CourseService service;

    
   // @RequestMapping(path = "/getproductList", method=RequestMethod.GET)
   
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getcourse")
	public List<Course> fetchCourseList(){
		List<Course> courses = new ArrayList<Course>();
		//logic to fetchh list from database
		courses =	service.fetchCourseList();
		return courses;
	}
    
    //for adding rows into database
    @CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(path="/addcourse",method=RequestMethod.POST)
	public String AddCourse(@RequestBody Course course)
	{
		
		 Course ob=service.saveCourseToDB(course);
		 String result=ob.getCourse_name()+" "+"your value is posted";
		 return  result;
		
	}
	
	
    
    
    
}
