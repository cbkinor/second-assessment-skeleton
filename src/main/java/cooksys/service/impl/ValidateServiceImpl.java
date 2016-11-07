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

	@Override
	public boolean doesUsernameExist(String username) {
		if (userRepo.findByUsernameAndDeletedFalse(username) == null)
			return true;
		return false;
	}

	@Override
	public boolean isUsernameAvailable(String username) {
		if (userRepo.findByUsernameAndDeletedFalse(username) == null)
			return true;
		return false;
	}


	 @Override
	    public boolean doesHashTagExist(String hashtag) {
	        if (hashTagRepo.findByHashtag(hashtag) == null)
	            return false;
	        return true;
	    }

	
}
