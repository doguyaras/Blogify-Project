package com.blogify.business.mappers;


import com.blogify.business.dto.ArticleDTO;
import com.blogify.model.entity.ArticleEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class ArticleMapper {

    public ArticleEntity dtoToArticleEntity(ArticleDTO articleDTO){
        log.info("Mapper log: Article dtoToArticleEntity executed successfully");

        ArticleEntity articleEntity = new ArticleEntity();
        articleEntity.setCategoryEntity(articleDTO.getCategoryEntity());
        articleEntity.setTitle(articleDTO.getTitle());
        articleEntity.setContent(articleDTO.getContent());
        articleEntity.setCreationDate(articleDTO.getCreationDate());
        articleEntity.setUpdateDate(articleDTO.getUpdateDate());
        articleEntity.setUserEntity(articleDTO.getUserEntity());

        return articleEntity;
    }
}
