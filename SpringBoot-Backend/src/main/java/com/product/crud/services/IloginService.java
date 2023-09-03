package com.product.crud.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.product.crud.model.Register;
@Service
public interface IloginService {
 Register fetchList(String f,String p);
}

