package com.product.crud.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.product.crud.model.Enroll;
@Repository
public interface EnrollRepo extends JpaRepository<Enroll,String> {
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value="INSERT INTO enroll(id, course_name, course_des, course_fees,username,image,cfile) VALUES (?, ?, ?, ?,?,?,?)",nativeQuery=true)
	void enrollcourse( String id, String course_name, String course_des, String course_fees, String username, String image, String cfile);

	

	
}
