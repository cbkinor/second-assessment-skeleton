package cooksys.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cooksys.entity.HashTag;
import cooksys.entity.Tweet;
import cooksys.repository.HashTagRepo;
import cooksys.service.HashTagService;

@Service
public class HashTagServiceImpl implements HashTagService {
	
	HashTagRepo hashTagRepo;
	
	public HashTagServiceImpl(HashTagRepo hashTagRepo) {
		this.hashTagRepo = hashTagRepo;
	}

	@Override
	public List<HashTag> getAll() {
		return hashTagRepo.findAll();
	}

}
