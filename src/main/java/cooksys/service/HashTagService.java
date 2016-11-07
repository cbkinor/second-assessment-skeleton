package cooksys.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cooksys.entity.HashTag;
import cooksys.entity.Tweet;

@Service
public interface HashTagService {

	public List<HashTag> getAll();

	public List<Tweet> getTweetWithHashtag(String hashtag);

}
