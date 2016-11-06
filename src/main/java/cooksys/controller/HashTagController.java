package cooksys.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cooksys.entity.HashTag;
import cooksys.service.HashTagService;

@RestController
@RequestMapping("hashes")
public class HashTagController {

    HashTagService service;
    public HashTagController(HashTagService service) {
        this.service = service;
    }
    
    @GetMapping
    public List<HashTag> getHashTag() {
    	return service.getAll();
    }
    
    
}
