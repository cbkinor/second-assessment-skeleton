package cooksys.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cooksys.entity.HashTag;
import cooksys.entity.Tweet;
import cooksys.service.HashTagService;
import cooksys.service.ValidateService;
@RestController
@RequestMapping("hashes")
public class HashTagController {

	ValidateService validateService;
    HashTagService hashTagService;
    public HashTagController(HashTagService hashTagService, ValidateService validateService) {
        this.hashTagService = hashTagService;
        this.validateService = validateService;
    }
    
    @GetMapping
    public List<HashTag> getHashTag() {
    	return hashTagService.getAll();
    }
 
}
