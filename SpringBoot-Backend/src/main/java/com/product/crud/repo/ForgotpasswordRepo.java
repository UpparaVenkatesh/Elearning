
package com.product.crud.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.product.crud.model.Register;
@Repository
public interface ForgotpasswordRepo extends JpaRepository<Register,String> {
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value="update registerelearn set password =?2,confirmpassword=?3 where email =?1",nativeQuery=true)
	void updateEmail( String email, String password, String confirmpassword);

	

	
}
