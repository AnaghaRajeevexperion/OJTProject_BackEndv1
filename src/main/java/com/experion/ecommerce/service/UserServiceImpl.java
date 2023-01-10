package com.experion.ecommerce.service;

import com.experion.ecommerce.dto.UserPost;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void parseToken(UserPost userPost) {
        String token=userPost.getUsertoken();

    }
}
