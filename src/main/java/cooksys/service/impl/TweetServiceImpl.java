package cooksys.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cooksys.entity.Credential;
import cooksys.entity.Tweet;
import cooksys.entity.User;
import cooksys.repository.TweetRepo;
import cooksys.repository.UserRepo;
import cooksys.service.TweetService;

@Service
public class TweetServiceImpl implements TweetService {

		TweetRepo tweetRepo;
		UserRepo userRepo;
		
		public TweetServiceImpl(TweetRepo tweetRepo, UserRepo userRepo) {
			this.tweetRepo = tweetRepo;
			this.userRepo = userRepo;
		}
		
	@Override
	public Tweet getById(Long id) {
		return tweetRepo.getOne(id);
	}

	@Override
	public List<Tweet> getAll() {
		return tweetRepo.findAll();
	}

	@Override
	public Tweet create(Tweet tweet) {
		tweet.setContent(tweet.getContent());
		return tweetRepo.saveAndFlush(tweet);
	}
	
	@Override
	public Tweet delete(Long id){
		Tweet tweet = tweetRepo.findById(id);
		tweet.setDeleted(true);
		return tweetRepo.saveAndFlush(tweet);
	}

	@Override
	public void likeTweet(long id, Credential credential) {
		Tweet tweet = tweetRepo.findById(id);
		User user = userRepo.findByUsername(credential.getUsername());
		tweet.getLikes().add(user);
		user.getLikedTweets().add(tweet);
	}
	
	@Override
	public List<User> getTweetLikes(long id) {
		return tweetRepo.findById(id).getLikes();
	}
	
}
