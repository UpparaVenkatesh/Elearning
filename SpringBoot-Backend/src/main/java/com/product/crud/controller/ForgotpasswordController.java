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
import com.product.crud.services.forgotpasswordService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ForgotpasswordController {
	@Autowired
	private forgotpasswordService service;
	//private IsearchService service;
	
	@RequestMapping(path="/searchbyemail/{email}/{password}/{confirmpassword}",method=RequestMethod.PUT)
	public String fetchProductList(@PathVariable String email,@PathVariable String password,@PathVariable String confirmpassword)
	{
		
		service.updateEmail(email, password, confirmpassword);
		return "success";
		
		
	}
	
	
}