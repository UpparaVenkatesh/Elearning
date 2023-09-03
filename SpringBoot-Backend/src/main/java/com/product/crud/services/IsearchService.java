package com.product.crud.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product.crud.model.Register;
@Service
public interface IsearchService {
 List<Register> fetchList(String f);
}

