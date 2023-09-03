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
import com.product.crud.services.IsearchService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SearchController {
	@Autowired
	private IsearchService service;
	//private IsearchService service;
	
	@RequestMapping(path="/searchbyusername/{username}",method=RequestMethod.GET)
	public List<Register> fetchProductList(@PathVariable String username)
	{
		List<Register> items=new ArrayList<Register>();
		items=service.fetchList(username);
		
		return items;
	}
}