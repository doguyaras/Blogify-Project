package com.blogify.service;

import com.blogify.enums.RoleEnum;
import com.blogify.model.entity.RoleEntity;

import java.util.List;


public interface RoleService {

    List<RoleEntity> findAll();
    void add(RoleEntity roles);
    RoleEntity findById(int id);
    void delete(int id);
    RoleEntity save(RoleEntity roles);

    RoleEntity findRoleByRoles(RoleEnum role);
}
