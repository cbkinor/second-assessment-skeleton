package cooksys.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cooksys.entity.Credential;
import cooksys.entity.Profile;
import cooksys.entity.User;
import cooksys.repository.UserRepo;
import cooksys.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

	@Override
	public User getById(Long id) {
		return userRepo.getOne(id);
	}
	
	@Override
	public User getByUsername(String username){
		return userRepo.findByUsername(username);
	}

	    @Override
	    public User add(User user) {
	        return userRepo.saveAndFlush(user);
	    }

		@Override
		public User patch(Credential credentials, Profile Profile) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public User delete(Credential credentials) {
			// TODO Auto-generated method stub
			return null;
		}


}


