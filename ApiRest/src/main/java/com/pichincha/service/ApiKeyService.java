package com.pichincha.service;

import com.pichincha.vo.User;

import java.util.UUID;

public class ApiKeyService {

    public String getApiKey(User myUser)
    {
        UUID apikey = UUID.randomUUID();
        User newUser = new User();
        newUser.setUser(myUser.getUser());
        newUser.setPassword(myUser.getPassword());
        newUser.setApiKey(apikey.toString());
        //myUserDB.put(myUser.getUser(),newUser);
        return apikey.toString();
    }
}
