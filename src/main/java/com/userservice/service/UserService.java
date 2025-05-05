package com.userservice.service;

import com.userservice.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUserByIs(String userId);
}
