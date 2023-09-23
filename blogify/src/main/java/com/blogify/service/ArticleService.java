package com.blogify.service;

import com.blogify.model.entity.ArticleEntity;

import java.util.List;

public interface ArticleService {

    List<ArticleEntity> findAll();
    void add(ArticleEntity articleEntity);
    ArticleEntity findById(int id);
    void delete(int id);
    ArticleEntity save(ArticleEntity articleEntity);
}
