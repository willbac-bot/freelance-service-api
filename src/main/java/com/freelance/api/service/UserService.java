package com.freelance.api.service;

import com.freelance.api.entity.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> findAll();
    User findById(UUID id);
    User save(User user);
    void delete(UUID id);
}
