package com.product.crud.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.crud.model.Register;
import com.product.crud.services.IsearchService;
import com.product.crud.model.Register;
import com.product.crud.services.CrudRegisterService;

import java.util.*;

@RestController
//@RequestMapping("/rest/register")
public class CrudRegisterRestController {
	 @Autowired
		private CrudRegisterService service;	

	 
	 // @RequestMapping(path = "/getregisterList", method=RequestMethod.GET)
	   
	    @CrossOrigin(origins = "http://localhost:4200")
	    @GetMapping("/getregisterList")
		public List<Register> fetchRegisterList(){
			List<Register> registers = new ArrayList<Register>();
			//logic to fetchh list from database
			registers =	service.fetchRegisterList();
			return registers;
		}

	    //for adding rows into database
	    @PostMapping("/addregister")
	    @CrossOrigin(origins = "http://localhost:4200")
	  	public Register saveRegister(@RequestBody Register register){
	  	 return service.saveRegisterToDB(register);
	  	}
	    
	    //for getting row based on ID
	    @GetMapping("/getregisterById/{id}")
	    @CrossOrigin(origins = "http://localhost:4200")
	    public Register fetchRegisterById(@PathVariable int id){
	    	return service.fetchRegisterById(id).get();
	    }
	    
	    //to delete entry in a database
	    @GetMapping("/deleteregisterById/{id}")
	    @CrossOrigin(origins = "http://localhost:4200")
	    public String DeleteregisterById(@PathVariable int id){
	    	return service.deleteRegisterById(id);
	    }
	    
	    
	   
	    
}
