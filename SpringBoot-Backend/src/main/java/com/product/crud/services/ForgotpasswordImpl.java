package com.product.crud.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.crud.model.Register;
import com.product.crud.repo.ForgotpasswordRepo;
@Service
public class ForgotpasswordImpl implements forgotpasswordService{
	@Autowired
	private ForgotpasswordRepo repo;
	
	@Override
	public void updateEmail(String email, String password ,String confirmpassword) {
	    repo.updateEmail(email,password,confirmpassword);
	
	}
}
