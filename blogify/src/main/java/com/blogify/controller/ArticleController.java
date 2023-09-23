package com.blogify.controller;

import com.blogify.model.entity.ArticleEntity;
import com.blogify.service.ArticleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("/articles")
    public List<ArticleEntity> findAll() {
        log.info("Controller Log: Article findAll method executed successfully");
        return articleService.findAll();
    }

    @GetMapping("/article/{id}")
    public ArticleEntity findById(@PathVariable int id) {
        log.info("Controller Log: Article findById method executed successfully");
        return articleService.findById(id);
    }

    @PostMapping("/article/add")
    public void add(@RequestBody ArticleEntity articleEntity) {
        log.info("Controller Log: Article add method executed successfully");
        articleService.add(articleEntity);
    }

    @DeleteMapping("/article/delete/{id}")
    public String delete(@PathVariable int id) {
        log.info("Controller Log: Article delete method executed successfully");
        articleService.delete(id);
        return "Deleted article id: " + id;
    }

    @PutMapping("/article/update")
    public ArticleEntity update(@RequestBody ArticleEntity articleEntity) {
        log.info("Controller Log: Article update method executed successfully");
        return articleService.save(articleEntity);
    }

}
