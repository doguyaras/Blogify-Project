package com.blogify.business.mappers;

import com.blogify.business.dto.UserDTO;
import com.blogify.model.entity.RoleEntity;
import com.blogify.model.entity.UserEntity;
import com.blogify.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class UserMapper {

    private final RoleService roleService;
    // private final ObjectMapper objectMapper;
    public UserEntity dtoToUserEntity(UserDTO userDTO){
        log.info("Mapper Log: User dtoToUserEntity executed successfully");
        // With object mapper
        // Users users1 = objectMapper.convertValue(usersDTO, Users.class);

        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(userDTO.getUsername());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setFirstName(userDTO.getFirstName());
        userEntity.setLastName(userDTO.getLastName());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setAddress(userDTO.getAddress());
        userEntity.setActive(userDTO.isActive());
        RoleEntity roleEntityByRoles = roleService.findRoleByRoles(userDTO.getRole());
        if (roleEntityByRoles != null){
            userEntity.setRoleEntity(roleEntityByRoles);
        }

        return userEntity;
    }

}
