package cooksys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cooksys.entity.Hash;

public interface hashRepo extends JpaRepository <Hash, Long> {

}
