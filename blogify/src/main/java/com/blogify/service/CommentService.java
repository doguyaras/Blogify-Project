package com.blogify.service;


import com.blogify.model.entity.CommentEntity;

import java.util.List;

public interface CommentService {

    List<CommentEntity> findAll();
    void add(CommentEntity commentEntity);
    CommentEntity findById(int id);
    void delete(int id);
    CommentEntity save(CommentEntity commentEntity);
}
