package cooksys.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cooksys.entity.User;
import cooksys.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{username}")
    public User getByUsername(@PathVariable User username) {
        return username;
    }
    
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAll();
    }
    
    @PostMapping
    public void postUser(@RequestBody User user) {
        userService.create(user);
    }
    
    
}
