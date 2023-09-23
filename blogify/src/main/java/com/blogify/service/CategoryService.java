package com.blogify.service;

import com.blogify.model.entity.CategoryEntity;

import java.util.List;

public interface CategoryService {

    List<CategoryEntity> findAll();
    void add(CategoryEntity categoryEntity);
    CategoryEntity findById(int id);
    void delete(int id);
    CategoryEntity save(CategoryEntity categoryEntity);
}
