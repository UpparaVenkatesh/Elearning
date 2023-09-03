package com.product.crud.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.crud.model.Register;
import com.product.crud.repo.LoginRepo;
@Service
public class LoginServiceImpl implements IloginService{
	@Autowired
	private LoginRepo repo;
	@Override
	public Register fetchList(String f,String p)
	{
		Register obj= repo.fetchList(f,p);
		return obj;
		
		
	}
}
