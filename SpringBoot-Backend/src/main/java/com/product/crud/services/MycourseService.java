package com.product.crud.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.product.crud.model.Enroll;
@Service
public interface MycourseService {
 List<Enroll> fetchCourseList(String f);
}