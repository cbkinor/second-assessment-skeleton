package cooksys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cooksys.service.HashService;

@RestController
@RequestMapping("hashes")
public class HashController {

    HashService service;
    public HashController(HashService service) {
        this.service = service;
    }
}
