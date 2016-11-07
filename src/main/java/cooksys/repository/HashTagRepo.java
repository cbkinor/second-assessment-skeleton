package cooksys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cooksys.entity.HashTag;

public interface HashTagRepo extends JpaRepository <HashTag, Long> {

	List<HashTag> findAll();
	
}
