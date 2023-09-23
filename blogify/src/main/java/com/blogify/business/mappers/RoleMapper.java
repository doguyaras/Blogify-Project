package com.blogify.business.mappers;

import com.blogify.business.dto.RoleDTO;
import com.blogify.model.entity.RoleEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RoleMapper {

    public RoleEntity dtoToRoleEntity (RoleDTO roleDTO){
        log.info("Mapper Log: Role dtoToRoleEntity executed successfully");

        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setRoles(roleDTO.getRoles());

        return roleEntity;

    }
}
