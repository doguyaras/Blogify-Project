package com.blogify.service;

import com.blogify.business.dto.UserDTO;
import com.blogify.model.entity.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> findAll();
    void add(UserDTO userDTO);
    UserEntity findById(int id);
    void delete(int id);
    UserEntity save(UserEntity user);
}
