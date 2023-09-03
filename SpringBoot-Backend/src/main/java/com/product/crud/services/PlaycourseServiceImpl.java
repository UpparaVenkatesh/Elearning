package com.product.crud.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.crud.model.Course;
import com.product.crud.repo.PlaycourseRepo;
@Service
public class PlaycourseServiceImpl implements PlaycourseService{
	@Autowired
	private PlaycourseRepo repo;
	@Override
	public List<Course> fetchcourse(String f)
	{
		List<Course> list=new ArrayList<Course>();
		list=repo.fetchcourse(f);
		return list;
		
	}
}
