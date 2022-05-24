package com.dev.sampleauthserver.model;

import com.dev.sampleauthserver.common.BaseClass;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class MemberDocument extends BaseClass {
    @Column(length = 500)
    private String approvalLetterUrl;

    @Column(length = 500)
    private String idCardUrl;

    @Column(length = 500)
    private String loanRestructureUrl;

    @Column(length = 500)
    private String termsAndConditionUrl;
}
