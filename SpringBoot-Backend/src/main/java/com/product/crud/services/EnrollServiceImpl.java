package com.product.crud.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.crud.model.Enroll;
import com.product.crud.repo.EnrollRepo;
@Service
public class EnrollServiceImpl implements EnrollService{
	@Autowired
	private EnrollRepo repo;
	
	@Override
	public void enrollcourse(String id, String course_name ,String course_des,String course_fees,String username,String image, String cfile) {
	    repo.enrollcourse(id,course_name,course_des,course_fees,username,image,cfile);
	
	}
}
