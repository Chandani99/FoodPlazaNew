package com.masai.service;

import java.util.List;

import com.masai.entity.Owner;
import com.masai.entity.UserDTO;
import com.masai.entity.UserType;
public interface OwnerService {
	
		public Owner addOwner(Owner owner, UserType userType)throws Exception;
		
		public String removeOwner(Integer Id);
		
		public List<Owner> getAllOwners();
		
		public Owner findByNameAndPassword(String userName, String password);
		
	
}