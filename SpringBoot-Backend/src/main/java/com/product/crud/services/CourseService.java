package com.product.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





import com.product.crud.model.Course;
import com.product.crud.repo.CourseRepo;

import java.util.*;

@Service
public class CourseService {
  
	@Autowired
	private CourseRepo repo;
	public List<Course> fetchCourseList(){
	return repo.findAll();
 }
	
	
	public Course saveCourseToDB(Course course){
		return repo.save(course);
	}
	
	
	
}
