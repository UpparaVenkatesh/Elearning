package com.product.crud.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.crud.model.Enroll;
import com.product.crud.repo.MycourseRepo;
@Service
public class MycourseServiceImpl implements MycourseService{
	@Autowired
	private MycourseRepo repo;
	@Override
	public List<Enroll> fetchCourseList(String f)
	{
		List<Enroll> list=new ArrayList<Enroll>();
		list=repo.fetchCourseList(f);
		return list;
		
	}
}