package cooksys.service.impl;

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
	public Tweet getTweet(Long id) {
		return tweetRepo.getOne(id);
	}

}
