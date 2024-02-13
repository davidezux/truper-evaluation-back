package com.evaluation.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "client" , schema = "demo")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "active")
    Boolean active;


/*
    @EmbeddedId
    private SysUserProfilePK id;


    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonBackReference
    private SysUser user;

    @ManyToOne
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private SysProfile profile;
*/



}
