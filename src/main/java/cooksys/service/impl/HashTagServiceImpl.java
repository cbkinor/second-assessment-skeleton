package cooksys.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cooksys.entity.HashTag;
import cooksys.repository.HashTagRepo;
import cooksys.service.HashTagService;

@Service
public class HashTagServiceImpl implements HashTagService {
	
	HashTagRepo hashRepo;
	
	public HashTagServiceImpl(HashTagRepo hashRepo) {
		this.hashRepo = hashRepo;
	}

	@Override
	public List<HashTag> getAll() {
		return hashRepo.getAll();
	}

}
