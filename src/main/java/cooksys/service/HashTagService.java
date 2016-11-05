package cooksys.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cooksys.entity.HashTag;

@Service
public interface HashTagService {

	public List<HashTag> getAll();

}
