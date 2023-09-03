package com.product.crud.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.product.crud.model.Register;
@Repository
public interface LoginRepo extends JpaRepository<Register,Integer> {
	@Transactional
	@Query(value="SELECT * FROM registerelearn  where username = ?1 and password = ?2  ",nativeQuery=true)
	public Register fetchList(String username,String password);
}