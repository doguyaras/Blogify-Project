package com.blogify.repository;

import com.blogify.enums.RoleEnum;
import com.blogify.model.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity,Integer> {

    RoleEntity findRoleByRoles(RoleEnum roles);
}
