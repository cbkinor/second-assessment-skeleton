package cooksys.service;

import org.springframework.stereotype.Service;

import cooksys.entity.Tweet;
import cooksys.entity.User;
import cooksys.repository.TweetRepo;
import cooksys.repository.UserRepo;

@Service
public class UserService {

	private UserRepo userRepo;
	private TweetRepo tweetRepo;
	
	public UserService(UserRepo userRepo, TweetRepo tweetRepo) {
		this.userRepo = userRepo;
		this.tweetRepo = tweetRepo;
	}
	
	public void addTweet(User user, Tweet tweet) {
		user.getTweets().add(tweet);
		userRepo.saveAndFlush(user);
	}
	
	public User get(Long id) {
		return userRepo.getOne(id);
	}
	
	public void add(User user) {
		userRepo.saveAndFlush(user);
	}
	
}
