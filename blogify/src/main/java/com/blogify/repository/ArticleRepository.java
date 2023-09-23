package com.blogify.repository;

import com.blogify.model.entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<ArticleEntity,Integer> {
}
