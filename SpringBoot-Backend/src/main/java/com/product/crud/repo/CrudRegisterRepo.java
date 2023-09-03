package com.product.crud.repo;
import org.springframework.data.jpa.repository.JpaRepository;


import com.product.crud.model.Register;

public interface CrudRegisterRepo extends JpaRepository<Register,Integer> {

}
