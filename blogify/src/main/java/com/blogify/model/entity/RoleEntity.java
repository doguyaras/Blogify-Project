package com.blogify.model.entity;

import com.blogify.enums.RoleEnum;
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
@Table(name = "role")
@Slf4j
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int roleId;
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private RoleEnum roles;

    @JsonIgnore
    @Transient
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "role",cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    private List<UserEntity> users;

}
