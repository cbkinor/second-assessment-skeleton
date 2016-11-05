package cooksys.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cooksys.entity.Tweet;
import cooksys.entity.User;
import cooksys.service.TweetService;

@RestController
@RequestMapping("tweets")
public class TweetController {

    TweetService tweetService;

    public TweetController(TweetService tweetService) {
        this.tweetService = tweetService;
    }
    
    @GetMapping("/{id}")
    public Tweet getById(@PathVariable Long id) {
    	return this.tweetService.getById(id);
    }
    
    @GetMapping
    public List<Tweet> getAllTweets() {
        return tweetService.getAll();
    }
    
    @PostMapping
    public void postTweet(@RequestBody Tweet tweet) {
    	tweetService.create(tweet);
    }
    
    @DeleteMapping("/{id}")
    public Tweet deleteTweet(@PathVariable Long id ) {
    	 return tweetService.delete(id);
    }
   
    
}
