package com.blogify.service.Imp;

import com.blogify.model.entity.ArticleEntity;
import com.blogify.repository.ArticleRepository;
import com.blogify.service.ArticleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ArticleServiceImp implements ArticleService {

    private final ArticleRepository articleRepository;

    @Override
    public List<ArticleEntity> findAll() {
        log.info("Service Log: Article findAll method executed successfully");
        return articleRepository.findAll();
    }

    @Override
    public ArticleEntity findById(int id) {
        log.info("Service Log: Article findById method executed successfully");
        Optional<ArticleEntity> result = articleRepository.findById(id);
        ArticleEntity articleEntity = null;
        if (result.isPresent()) {
            articleEntity = result.get();
        } else {
            throw new RuntimeException("Id can not find!: " + id);
        }
        return articleEntity;
    }

    @Override
    public void add(ArticleEntity articleEntity) {
        log.info("Service Log: Article add method executed successfully");
        articleRepository.save(articleEntity);
    }

    @Override
    public void delete(int id) {
        log.info("Service Log: Article delete method executed successfully");
        articleRepository.deleteById(id);
    }

    @Override
    public ArticleEntity save(ArticleEntity articleEntity) {
        log.info("Service Log: Article save method executed successfully");
        return articleRepository.save(articleEntity);
    }
}
