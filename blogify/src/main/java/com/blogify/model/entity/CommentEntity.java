package com.blogify.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "comment")
@Slf4j
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int commentId;
    @Column(name = "content")
    private String content;
    @Column(name = "creationdate")
    private Date creationDate;

    @ManyToOne(cascade = {
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    @JoinColumn(name = "articleid")
    private ArticleEntity articleEntity;

    /*@Column(name = "articleid")
    private int articleid;*/

    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    @JoinColumn(name = "userid")
    private UserEntity userEntity;

    /*@Column(name = "userid")
    private int userid;*/

}
