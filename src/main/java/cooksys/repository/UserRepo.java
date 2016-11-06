package cooksys.repository;

import cooksys.entity.Credential;
import cooksys.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User findByCredential(Credential credential);

//    public User doesExist(String username);

}