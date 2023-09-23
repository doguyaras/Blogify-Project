package com.blogify.business.dto;

import com.blogify.enums.RoleEnum;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class UserDTO {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private boolean active;
    private RoleEnum role;

}
