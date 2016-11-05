package cooksys.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cooksys.entity.Credential;
import cooksys.entity.Profile;
import cooksys.entity.User;
import cooksys.repository.CredentialRepo;
import cooksys.repository.UserRepo;
import cooksys.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    UserRepo userRepo;
    CredentialRepo credentialRepo;

    public UserServiceImpl(UserRepo userRepo, CredentialRepo credentialRepo) {
        this.userRepo = userRepo;
        this.credentialRepo = credentialRepo;
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
    	user.setUsername(user.getCredential().getUsername());
        return userRepo.saveAndFlush(user);
    }

	@Override
	public User patch(Credential credential, Profile profile) {
		User user = userRepo.findByCredential(credential);
		user.setProfile(profile);
		return userRepo.saveAndFlush(user);
	}

	@Override
	public User delete(User user) {
		User deleteUser = userRepo.findByUsername(user.getUsername());
		deleteUser.setDeleted(true);
		return userRepo.saveAndFlush(user);
	}

}


