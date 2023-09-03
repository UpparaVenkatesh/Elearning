package com.product.crud.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product.crud.model.Course;
@Service
public interface PlaycourseService {
 List<Course> fetchcourse(String f);
}
