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
    
    @GetMapping("tag/exists/{label}")
    public boolean doesTagExist(@PathVariable String label) {
        return validateService.hashTagExists(label);
    }

}