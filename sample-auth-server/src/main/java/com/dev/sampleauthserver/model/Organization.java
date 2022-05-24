package com.dev.sampleauthserver.model;

import com.dev.sampleauthserver.common.BaseClass;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Getter
@Setter
@Entity
public class Organization extends BaseClass {
    @Column(unique = true)
    private String name;

    @OneToOne
    private Address address;

    @OneToMany(mappedBy = "organization")
    @JsonIgnore
    private Set<Member> members;

    @OneToMany
    @JsonIgnore
    private Set<Admin> admins;

    @OneToMany(mappedBy = "organization")
    private Set<TrustGroup> trustGroups;
}
