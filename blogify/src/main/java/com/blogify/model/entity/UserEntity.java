package com.blogify.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Slf4j
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int userId;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "active")
    private boolean active;

    /*@JsonBackReference*/
    @ManyToOne(fetch = FetchType.EAGER,cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    @JoinColumn(name = "roleid")
    private RoleEntity roleEntity;
    /*@Column(name = "roleid")
    private int roleid;*/

    @JsonIgnore
    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL)
    private List<ArticleEntity> articleEntities;

    @JsonIgnore
    @OneToMany(mappedBy = "userEntity", cascade = CascadeType.ALL)
    private List<CommentEntity> commentEntities;
}
