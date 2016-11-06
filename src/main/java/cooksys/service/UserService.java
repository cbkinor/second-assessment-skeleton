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

    public User patch(Credential credential, Profile Profile);

    public User delete(Credential credential);

	public void followUser(String username, Credential credential);

	public void unfollowUser(String username, Credential credential);

	public List<User> getFollowers(String username);

	public List<User> getFollowing(String username);

	

	
}
