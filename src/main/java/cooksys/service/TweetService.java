package cooksys.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cooksys.entity.Hash;
import cooksys.entity.Tweet;
import cooksys.repository.HashRepo;
import cooksys.repository.TweetRepo;

@Service
public interface TweetService {

	public Tweet getById(Long id);

	public List<Tweet> getAll();

	public Tweet create(Tweet tweet);
	
	


}
