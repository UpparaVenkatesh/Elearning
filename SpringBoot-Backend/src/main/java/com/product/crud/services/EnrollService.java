package com.product.crud.services;
import java.util.List;

import com.product.crud.model.Enroll;

public interface EnrollService {

  void enrollcourse(String id, String course_name, String course_des, String course_fees, String username, String image, String cfile);

}
