package com.blogify.service.Imp;

import com.blogify.enums.RoleEnum;
import com.blogify.model.entity.RoleEntity;
import com.blogify.repository.RoleRepository;
import com.blogify.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoleServiceImp implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public List<RoleEntity> findAll() {
        log.info("Service Log: Role findAll method executed successfully");
        return roleRepository.findAll();
    }

    @Override
    public RoleEntity findById(int id) {
        log.info("Service Log: Role findById method executed successfully");
        Optional<RoleEntity> result = roleRepository.findById(id);
        RoleEntity roleEntity = null;
        if(result.isPresent()){
            roleEntity = result.get();
        }else {
            throw new RuntimeException("Id can not found!"+id);
        }
        return roleEntity;

    }

    @Override
    @Transactional
    public void add(RoleEntity roles) {
        log.info("Service Log: Role add method executed successfully");
        roleRepository.save(roles);
    }

    @Override
    @Transactional
    public void delete(int id) {
        log.info("Service Log: Role delete method executed successfully");
        roleRepository.deleteById(id);
    }

    @Override
    @Transactional
    public RoleEntity save(RoleEntity roles) {
        log.info("Service Log: Role save method executed successfully");
        return roleRepository.save(roles);
    }

    @Override
    public RoleEntity findRoleByRoles(RoleEnum role) {
        log.info("Service Log: Role findRoleByRoles method executed successfully");
        return roleRepository.findRoleByRoles(role);
    }
}
