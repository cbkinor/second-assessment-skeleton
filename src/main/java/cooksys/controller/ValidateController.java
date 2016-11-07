package cooksys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cooksys.service.ValidateService;

@RestController
@RequestMapping("validate")
public class ValidateController {

    ValidateService validateService;

    public ValidateController(ValidateService validateService) {
        this.validateService = validateService;
    }
    
    @GetMapping("username/exists/{username}")
    public boolean doesUsernameExist(@PathVariable String username) {
        return validateService.doesUsernameExist(username);
    }
    
    @GetMapping("username/available/{username}")
    public boolean isUsernameAvailable(@PathVariable String username) {
        return validateService.isUsernameAvailable(username);
    }
    
    @GetMapping("tag/exists/{label}")
    public boolean doesTagExist(@PathVariable String label) {
        return validateService.doesHashTagExist(label);
    }
}
