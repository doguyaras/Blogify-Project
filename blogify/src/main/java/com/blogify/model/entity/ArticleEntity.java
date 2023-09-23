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
@Table(name = "article")
@Slf4j
public class ArticleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int articleId;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;

    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    @JoinColumn(name = "categoryid")
    private CategoryEntity categoryEntity;

    /*@Column(name = "categoryid")
    private int categoryid;
*/
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

    @Column(name = "creationdate")
    private Date creationDate;
    @Column(name = "updatedate")
    private Date updateDate;

    /*@OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    private List<Comment> comments;*/

}
