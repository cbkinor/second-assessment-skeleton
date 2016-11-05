package cooksys.service;

import org.springframework.stereotype.Service;

import cooksys.entity.Hash;
import cooksys.entity.Tweet;
import cooksys.repository.HashRepo;
import cooksys.repository.TweetRepo;

@Service
public interface TweetService {

	public Tweet getTweet(Long id);


}
