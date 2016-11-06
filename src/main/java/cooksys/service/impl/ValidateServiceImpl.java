package cooksys.service.impl;

import org.springframework.stereotype.Service;

import cooksys.repository.HashTagRepo;
import cooksys.repository.UserRepo;
import cooksys.service.ValidateService;

@Service
public class ValidateServiceImpl implements ValidateService {
	
	private HashTagRepo hashTagRepo;
	
	public ValidateServiceImpl(HashTagRepo hasTagRepo){
		this.hashTagRepo = hasTagRepo;
	}


}
