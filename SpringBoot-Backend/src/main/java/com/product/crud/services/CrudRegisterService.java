package com.product.crud.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


import com.product.crud.model.Register;
import com.product.crud.repo.CrudRegisterRepo;

@Service
public class CrudRegisterService {

	
	@Autowired
	private CrudRegisterRepo repo;
	
	public List<Register> fetchRegisterList() {
		return repo.findAll();
		
	}
	
	public Register saveRegisterToDB(Register register) {
		return repo.save(register);
	}
	
	public Optional<Register> fetchRegisterById(int id) {
		return repo.findById(id);
	}


	public String deleteRegisterById(int id) {
		String result;
		try{
	           repo.deleteById(id);
	           result = "Row Deleted";
		}
		catch (Exception e){
			result = "Row not Deleted";
		}
		return result;
	}
	
	

	
	
	

}
