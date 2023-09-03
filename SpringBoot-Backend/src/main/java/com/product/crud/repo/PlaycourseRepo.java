package com.product.crud.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.product.crud.model.Course;
@Repository
public interface PlaycourseRepo extends JpaRepository<Course,Integer> {
	@Transactional
	@Modifying
	@Query(value="SELECT * FROM course  where id = ?1",nativeQuery=true)
	 List<Course> fetchcourse(String id);
}