package com.blogify.business.dto;

import com.blogify.model.entity.CategoryEntity;
import com.blogify.model.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class ArticleDTO {

    private String title;
    private String content;
    private CategoryEntity categoryEntity;
    private UserEntity userEntity;
    private Date creationDate;
    private Date updateDate;
}
