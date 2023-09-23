package com.blogify.service.Imp;

import com.blogify.model.entity.CategoryEntity;
import com.blogify.repository.CategoryRepository;
import com.blogify.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CategoryServiceImp implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryEntity> findAll() {
        log.info("Service Log: Category findAll method executed successfully");
        return categoryRepository.findAll();
    }

    @Override
    public CategoryEntity findById(int id) {
        log.info("Service Log: Category findById method executed successfully");
        Optional<CategoryEntity> result = categoryRepository.findById(id);
        CategoryEntity categoryEntity = null;
        if (result.isPresent()) {
            categoryEntity = result.get();
        } else {
            throw new RuntimeException("Id can not find!" + id);
        }
        return categoryEntity;
    }

    @Override
    public void add(CategoryEntity categoryEntity) {
        log.info("Service Log: Category add method executed successfully");
        categoryRepository.save(categoryEntity);
    }

    @Override
    public void delete(int id) {
        log.info("Service Log: Category delete method executed successfully");
        categoryRepository.deleteById(id);
    }

    @Override
    public CategoryEntity save(CategoryEntity categoryEntity) {
        log.info("Service Log: Category save method executed successfully");
        return categoryRepository.save(categoryEntity);
    }
}
