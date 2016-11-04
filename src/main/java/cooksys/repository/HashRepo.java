package cooksys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cooksys.entity.Hash;

public interface HashRepo extends JpaRepository <Hash, Long> {

}
