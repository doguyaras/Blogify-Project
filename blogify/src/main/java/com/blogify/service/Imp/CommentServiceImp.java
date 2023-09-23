package com.blogify.service.Imp;

import com.blogify.model.entity.CommentEntity;
import com.blogify.repository.CommentRepository;
import com.blogify.service.CommentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CommentServiceImp implements CommentService {

    private final CommentRepository commentRepository;

    @Override
    public List<CommentEntity> findAll() {
        log.info("Service Log: Comment findAll method executed successfully");
        return commentRepository.findAll();
    }

    @Override
    public CommentEntity findById(int id) {
        log.info("Service Log: Comment findById method executed successfully");
        Optional<CommentEntity> result = commentRepository.findById(id);
        CommentEntity commentEntity = null;
        if(result.isPresent()){
            commentEntity = result.get();
        }else {
            throw new RuntimeException("Id not found!:");
        }
        return commentEntity;
    }

    @Override
    @Transactional
    public void add(CommentEntity commentEntity) {
        log.info("Service Log: Comment add method executed successfully");
        commentRepository.save(commentEntity);
    }

    @Override
    @Transactional
    public void delete(int id) {
        log.info("Service Log: Comment delete method executed successfully");
        commentRepository.deleteById(id);
    }

    @Override
    @Transactional
    public CommentEntity save(CommentEntity commentEntity) {
        log.info("Service Log: Comment save method executed successfully");
        return commentRepository.save(commentEntity);
    }
}
