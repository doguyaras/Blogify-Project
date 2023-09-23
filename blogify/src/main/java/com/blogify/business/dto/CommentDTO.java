package com.blogify.business.dto;

import com.blogify.model.entity.ArticleEntity;
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
public class CommentDTO {

    private String content;
    private Date creationDate;
    private ArticleEntity articleEntity;
    private UserEntity userEntity;


}
