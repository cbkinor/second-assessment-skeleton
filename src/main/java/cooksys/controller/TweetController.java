package cooksys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cooksys.entity.Tweet;
import cooksys.service.TweetService;

@RestController
@RequestMapping("tweets")
public class TweetController {

    TweetService tweetService;

    public TweetController(TweetService tweetService) {
        this.tweetService = tweetService;
    }
    
    @GetMapping("/{id}")
    public Tweet getTweet(@PathVariable Long id) {
    	return this.tweetService.getTweet(id);
    }
    
}
