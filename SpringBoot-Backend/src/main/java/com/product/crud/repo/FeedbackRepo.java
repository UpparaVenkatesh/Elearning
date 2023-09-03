package com.product.crud.repo;


import org.springframework.data.jpa.repository.JpaRepository;


import com.product.crud.model.Feedback;


public interface FeedbackRepo extends JpaRepository<Feedback,Integer>{

}