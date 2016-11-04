package cooksys.service;

import org.springframework.stereotype.Service;

import cooksys.entity.Hash;
import cooksys.entity.Tweet;
import cooksys.repository.HashRepo;
import cooksys.repository.TweetRepo;

@Service
public class TweetService {

	private TweetRepo tweetRepo;
	private HashRepo hashRepo;

	public TweetService(TweetRepo tweetRepo, HashRepo hashRepo) {
		this.tweetRepo = tweetRepo;
		this.hashRepo = hashRepo;
	}

	public void addHashs(Tweet tweet, Hash Hash) {
		tweet.getHashs().add(Hash);
		tweetRepo.saveAndFlush(tweet);
	}

	public Tweet get(Long id) {
		return tweetRepo.getOne(id);
	}

	public void add(Tweet tweet) {

		tweetRepo.saveAndFlush(tweet);
	}
}
