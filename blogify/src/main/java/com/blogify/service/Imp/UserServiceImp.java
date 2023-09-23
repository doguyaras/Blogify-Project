package com.blogify.service.Imp;

import com.blogify.business.dto.UserDTO;
import com.blogify.business.mappers.UserMapper;
import com.blogify.model.entity.UserEntity;
import com.blogify.repository.UserRepository;
import com.blogify.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    @Override
    public List<UserEntity> findAll() {
        log.info("Service Log: User findAll method executed successfully");
        return userRepository.findAll();
    }

    @Override
    public UserEntity findById(int id) {
        log.info("Service Log: User findById method executed successfully");
        Optional<UserEntity> result = userRepository.findById(id);
        UserEntity user = null;
        if(result.isPresent()){
            user = result.get();
        }else {
            throw new RuntimeException("Id can not find!: "+id);
        }

        return user;

    }

    @Override
    @Transactional
    public void add(UserDTO userDTO) {
        log.info("Service Log: User add method executed successfully");
        UserEntity userEntity = userMapper.dtoToUserEntity(userDTO);
        userRepository.save(userEntity);
    }

    @Override
    @Transactional
    public void delete(int id) {
        log.info("Service Log: User delete method executed successfully");
        userRepository.deleteById(id);
    }

    @Override
    @Transactional
    public UserEntity save(UserEntity user) {
        log.info("Service Log: User save method executed successfully");
        return userRepository.save(user);
    }

}
