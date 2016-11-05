package cooksys.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cooksys.entity.Tweet;
import cooksys.repository.TweetRepo;
import cooksys.service.TweetService;

@Service
public class TweetServiceImpl implements TweetService {

		TweetRepo tweetRepo;
		
		public TweetServiceImpl(TweetRepo tweetRepo) {
			this.tweetRepo = tweetRepo;
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
}
