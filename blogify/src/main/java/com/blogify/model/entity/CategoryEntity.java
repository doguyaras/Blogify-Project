package com.blogify.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
@Slf4j
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int categoryId;
    @Column(name = "categoryname")
    private String categoryName;

    @JsonIgnore
    @OneToMany(mappedBy = "categoryEntity",cascade = CascadeType.ALL)
    private List<ArticleEntity> articleEntities;

}
