package cooksys.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cooksys.entity.Credential;
import cooksys.entity.Profile;
import cooksys.entity.User;


@Service
public interface UserService {

	public User getById(Long id);
	
	User getByUsername(String username);
	
	public List<User> getAll();

    public User create(User user);

    public User patch(Credential credentials, Profile Profile);

    public User delete(Credential credentials);
	
}
