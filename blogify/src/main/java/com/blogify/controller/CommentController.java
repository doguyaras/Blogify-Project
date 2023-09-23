package com.blogify.controller;

import com.blogify.model.entity.CommentEntity;
import com.blogify.service.CommentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class CommentController {

    private final CommentService commentService;

    @GetMapping("/comments")
    public List<CommentEntity> findAll(){
        log.info("Controller Log: Comment findAll method executed successfully");
        return commentService.findAll();
    }

    @GetMapping("/comment/{id}")
    public CommentEntity findById(@PathVariable int id){
        log.info("Controller Log: Comment findById method executed successfully");
        return commentService.findById(id);
    }

    @PostMapping("/comment/add")
    public void add(@RequestBody CommentEntity commentEntity){
        log.info("Controller Log: Comment add method executed successfully");
        commentService.add(commentEntity);
    }

    @DeleteMapping("/comment/delete/{id}")
    public String delete(@PathVariable int id){
        log.info("Controller Log: Comment delete method executed successfully");
        commentService.delete(id);
        return "Deleted comment id: "+id;
    }

    @PutMapping("/comment/update")
    public CommentEntity update(@RequestBody CommentEntity commentEntity) {
        log.info("Controller Log: Comment update method executed successfully");
        return commentService.save(commentEntity);
    }
}
