package com.blogify.controller;

import com.blogify.model.entity.RoleEntity;
import com.blogify.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class RoleController {

    private final RoleService roleService;

    @GetMapping("/roles")
    public List<RoleEntity> findAll() {
        log.info("Controller Log: Role findAll method executed successfully");
        return roleService.findAll();
    }

    @GetMapping("/role/{id}")
    public RoleEntity findById(@PathVariable int id){
        log.info("Controller Log: Role findById method executed successfully");
        return roleService.findById(id);
    }

    @PostMapping("/role/add")
    public void add(@RequestBody RoleEntity roleEntity){
        log.info("Controller Log: Role add method executed successfully");
        roleService.add(roleEntity);
    }

    @DeleteMapping("/role/delete/{id}")
    public String delete(@PathVariable int id){
        log.info("Controller Log: Role delete method executed successfully");
        roleService.delete(id);
        return "Deleted role id: "+id;
    }

    @PutMapping("/role/update")
    public RoleEntity update(@RequestBody RoleEntity roleEntity) {
        log.info("Controller Log: Role update method executed successfully");
        return roleService.save(roleEntity);
    }
}
