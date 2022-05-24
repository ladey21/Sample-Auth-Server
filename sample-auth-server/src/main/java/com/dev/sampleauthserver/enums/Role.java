package com.dev.sampleauthserver.enums;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;


public enum Role {
    ADMIN, USER, MEMBER, SUPER_ADMIN;

    @Id
    @Column(name = "id",nullable = false)
    private Long id;

    public Long getId(){return id;}

    public void setId(Long id){ this.id = id;}
}
