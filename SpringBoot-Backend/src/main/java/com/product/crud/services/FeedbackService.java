package com.product.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.crud.model.Feedback;
import com.product.crud.repo.FeedbackRepo;

import java.util.*;

@Service
public class FeedbackService {
  
	@Autowired
	private FeedbackRepo repo;
	public List<Feedback> fetchFeedbackList(){
	return repo.findAll();
 }
	
	
	public Feedback saveFeedbackToDB(Feedback feedback){
		return repo.save(feedback);
	}
	
	
	
}