package com.experion.ecommerce.controller;

import com.experion.ecommerce.dto.UserPost;
import com.experion.ecommerce.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class UserController {
    @Autowired
     UserService userService;

    @PostMapping("/token request")
    public ResponseEntity createJwtToken(@RequestBody UserPost userPost) throws JsonProcessingException {
        return userService.parseToken(userPost);
    }
}
