package com.blogify.controller;

import com.blogify.model.entity.CategoryEntity;
import com.blogify.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/categories")
    public List<CategoryEntity> findAll() {
        log.info("Controller Log: Category findAll method executed successfully");
        return categoryService.findAll();
    }

    @GetMapping("/category/{id}")
    public CategoryEntity findById(@PathVariable int id){
        log.info("Controller Log: Category findById method executed successfully");
        return categoryService.findById(id);
    }

    @PostMapping("/category/add")
    public void add(@RequestBody CategoryEntity categoryEntity){
        log.info("Controller Log: Category add method executed successfully");
        categoryService.add(categoryEntity);
    }

    @DeleteMapping("/category/delete/{id}")
    public String delete(@PathVariable int id){
        log.info("Controller Log: Category delete method executed successfully");
        categoryService.delete(id);
        return "Deleted category id: "+id;
    }

    @PutMapping("/category/update")
    public CategoryEntity update(@RequestBody CategoryEntity categoryEntity) {
        log.info("Controller Log: Category update method executed successfully");
        return categoryService.save(categoryEntity);
    }
}
