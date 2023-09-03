package com.product.crud;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import org.springframework.test.annotation.Rollback;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;



import org.junit.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;




import com.product.crud.model.Register;
import com.product.crud.repo.CrudRegisterRepo;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class RegisterTests {
	
	@Autowired
	private CrudRegisterRepo repo;
	
	@Test
	@Rollback(false)
	public void testCreateRegister() {
		Register register = new Register(1,"raj","kumar","03-01-2000","male","9876453425","raj","raj@gmail.com","raj123","raj123");
		Register savedregister = repo.save(register);
		assertNotNull(savedregister);
		
	}
	@Test
	public void testListRegisters() { 
	 List<Register> registers = (List<Register>) repo.findAll();
	 for ( Register register : registers)
	 {
		 System.out.println(register);
	 }
    	assertThat(registers).size().isGreaterThan(0);
	}
	
	

}
