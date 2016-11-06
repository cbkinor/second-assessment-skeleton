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
    
//    @GetMapping("username/exists/{username}")
//    public boolean usernameExists(@PathVariable String username){
//    	return validateService.usernameExists(username);
//    }

}
