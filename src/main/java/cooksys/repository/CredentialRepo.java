package cooksys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cooksys.entity.Credential;
import cooksys.entity.User;

public interface CredentialRepo extends JpaRepository<User, Long> {

	
}
