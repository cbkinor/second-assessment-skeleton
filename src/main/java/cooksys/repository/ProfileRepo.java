package cooksys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cooksys.entity.Tweet;

public interface ProfileRepo extends JpaRepository <Tweet, Long> {

}
