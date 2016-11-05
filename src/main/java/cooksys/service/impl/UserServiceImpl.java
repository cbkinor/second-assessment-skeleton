package cooksys.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cooksys.entity.Credential;
import cooksys.entity.Profile;
import cooksys.entity.User;
import cooksys.repository.ProfileRepo;
import cooksys.repository.UserRepo;
import cooksys.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    UserRepo userRepo;
    ProfileRepo profileRepo;

    public UserServiceImpl(UserRepo userRepo, ProfileRepo profileRepo) {
        this.userRepo = userRepo;
        this.profileRepo = profileRepo;
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
    public User create(User user) {
        return userRepo.saveAndFlush(user);
    }

	@Override
	public User patch(Credential credential, Profile profile) {
		User user = userRepo.findByCredentials(credential);
		user.setProfile(profile);
		return userRepo.saveAndFlush(user);
	}

	@Override
	public User delete(Credential credentials) {
		// TODO Auto-generated method stub
		return null;
	}

}


