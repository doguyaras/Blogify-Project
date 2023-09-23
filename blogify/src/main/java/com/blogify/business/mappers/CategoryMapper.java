package com.blogify.business.mappers;

import com.blogify.business.dto.CategoryDTO;
import com.blogify.model.entity.CategoryEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CategoryMapper {

    public CategoryEntity dtoToCategoryEntity(CategoryDTO categoryDTO){
        log.info("Mapper Log: Category dtoToCategoryEntity executed successfully");

        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setCategoryName(categoryDTO.getCategoryName());

        return categoryEntity;
    }
}
