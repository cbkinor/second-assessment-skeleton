package cooksys.controller;

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
}
