package com.product.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.crud.model.Course;


public interface CourseRepo extends JpaRepository<Course,Integer> {

}
