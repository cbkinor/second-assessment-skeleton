package cooksys.service.impl;

import org.springframework.stereotype.Service;

import cooksys.repository.HashTagRepo;
import cooksys.repository.UserRepo;
import cooksys.service.ValidateService;

@Service
public class ValidateServiceImpl implements ValidateService {
	
	private HashTagRepo hashTagRepo;
	private UserRepo userRepo;
	
	public ValidateServiceImpl(HashTagRepo hasTagRepo, UserRepo userRepo){
		this.hashTagRepo = hasTagRepo;
		this.userRepo = userRepo;
	}

//	@Override
//	public boolean usernameExists(String username) {
//		if (userRepo.doesExist(username)==null)
//			return true;
//		return false;
//	}


}
