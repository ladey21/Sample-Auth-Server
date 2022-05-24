package com.dev.sampleauthserver.model;

import com.dev.sampleauthserver.common.BaseClass;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Admin extends BaseClass implements AdminOrMember {

    private static String NAME_VALUE = "ADMIN";

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User user;

    @Builder.Default
    private Boolean isSuperAdmin = false;

    @Override
    public String nameValue() {
        return NAME_VALUE;
    }

    @Override
    public Admin returnAdminSelf() {
        return this;
    }

    @Override
    public Member returnMemberSelf() {
        return null;
    }
}
