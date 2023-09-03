package com.product.crud.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.crud.model.Register;
import com.product.crud.repo.SearchRepo;
@Service
public class SearchServiceImpl implements IsearchService{
	@Autowired
	private SearchRepo repo;
	@Override
	public List<Register> fetchList(String f)
	{
		List<Register> list=new ArrayList<Register>();
		list=repo.fetchList(f);
		return list;
		
	}
}