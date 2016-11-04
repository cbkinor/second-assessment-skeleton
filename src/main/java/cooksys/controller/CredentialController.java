package cooksys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cooksys.service.CredentialService;


@RestController
@RequestMapping("credentials")
public class CredentialController {

	CredentialService credentialService;

    public CredentialController(CredentialService credentialService) {
        this.credentialService = credentialService;
    }
}
