package cooksys.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cooksys.entity.Credential;
import cooksys.entity.HashTag;
import cooksys.entity.Tweet;
import cooksys.entity.User;
import cooksys.repository.HashTagRepo;
import cooksys.repository.TweetRepo;

@Service
public interface TweetService {

	public Tweet getById(Long id);

	public List<Tweet> getAll();

	public Tweet create(Tweet tweet);

	public Tweet delete(Long id);

	public void likeTweet(long id, Credential credential);

	public List<User> getTweetLikes(long id);
	
	


}
