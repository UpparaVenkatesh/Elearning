package com.product.crud.services;

import java.util.List;

import com.product.crud.model.Register;

public interface forgotpasswordService {

  void updateEmail(String email, String password, String confirmpassword);

}
