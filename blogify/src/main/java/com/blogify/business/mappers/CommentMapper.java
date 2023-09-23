package com.blogify.business.mappers;

import com.blogify.business.dto.CommentDTO;
import com.blogify.model.entity.CommentEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CommentMapper {

    public CommentEntity dtoToCommentEntity(CommentDTO commentDTO) {
        log.info("Mapper Log: Comment dtoToCommentEntity executed successfully");

        CommentEntity commentEntity = new CommentEntity();
        commentEntity.setContent(commentDTO.getContent());
        commentEntity.setArticleEntity(commentDTO.getArticleEntity());
        commentEntity.setUserEntity(commentDTO.getUserEntity());
        commentEntity.setCreationDate(commentDTO.getCreationDate());

        return commentEntity;
    }
}
