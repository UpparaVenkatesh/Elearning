package com.product.crud.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.crud.model.Register;
import com.product.crud.services.IloginService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	@Autowired
	private IloginService service;
	//private IsearchService service;
	
	@RequestMapping(path="/loginvalidate/{username}/{password}",method=RequestMethod.POST)
	public String fetchProductList(@PathVariable String username,@PathVariable String password)
	{
		
		
		String result;
		Register obj=service.fetchList(username, password);
		if(obj!=null)
			result="Success";
			else
			result="Unsuccessful";
			return result;
		
	}
}
