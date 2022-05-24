package com.dev.sampleauthserver.model;

import com.dev.sampleauthserver.common.BaseClass;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "finance")
public class Finance extends BaseClass {
    private BigDecimal loanAmount;

    private BigDecimal monthlyPayment;

    @OneToOne
    private TrustGroup trustGroup;

    @OneToMany(mappedBy = "finance")
    private List<Member> members;

    @OneToMany(mappedBy = "finance")
    private List<Transaction> transactions;

    @OneToOne
    private Organization organization;
}
