package com.blogify.controller;

import com.blogify.business.dto.UserDTO;
import com.blogify.model.entity.UserEntity;
import com.blogify.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserEntity> findAll() {
        log.info("Controller Log: User findAll method executed successfully");
        return userService.findAll();

    }

    @GetMapping("/{id}")
    public UserEntity findById(@PathVariable int id) {
        log.info("Controller Log: User findById method executed successfully");
        return userService.findById(id);
    }

    @PostMapping()
    public void add(@RequestBody UserDTO userDTO) {
        log.info("Controller Log: User add method executed successfully");
        userService.add(userDTO);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        log.info("Controller Log: User delete method executed successfully");
        userService.delete(id);
        return "Deleted user id: " + id;
    }

    @PutMapping("/{id}")
    public UserEntity update(@RequestBody UserEntity userEntity) {
        log.info("Controller Log: User update method executed successfully");
        return userService.save(userEntity);
    }
}
