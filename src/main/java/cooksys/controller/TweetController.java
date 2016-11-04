package cooksys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cooksys.service.TweetService;

@RestController
@RequestMapping("tweets")
public class TweetController {

    TweetService tweetService;

    public TweetController(TweetService tweetService) {
        this.tweetService = tweetService;
    }
}
