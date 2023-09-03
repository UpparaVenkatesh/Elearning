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

import java.util.*;

import com.product.crud.model.Feedback;

import com.product.crud.services.FeedbackService;

@RestController
public class FeedbackRestController {

    @Autowired
	private FeedbackService service;

    
   // @RequestMapping(path = "/getproductList", method=RequestMethod.GET)
   
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getfeedback")
	public List<Feedback> fetchFeedbackList(){
		List<Feedback> feedbacks = new ArrayList<Feedback>();
		//logic to fetchh list from database
		feedbacks =	service.fetchFeedbackList();
		return feedbacks;
	}
    
    //for adding rows into database
    @PostMapping("/addfeedback")
    @CrossOrigin(origins = "http://localhost:4200")
  	public Feedback saveFeedback(@RequestBody Feedback feedback){
  	 return service.saveFeedbackToDB(feedback);
  	}
    
  /*
    
    //for getting row based on ID
    @GetMapping("/getproductById/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Product fetchProductById(@PathVariable int id){
    	return service.fetchProductById(id).get();
    }
    
    //to delete entry in a database
    @GetMapping("/deleteproductById/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public String DeleteproductById(@PathVariable int id){
    	return service.deleteProductById(id);
    }
    
    */
    
    
}

