package com.dev.sampleauthserver.model;

import com.dev.sampleauthserver.common.BaseClass;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TrustGroup extends BaseClass {

    @Column(unique = true,nullable = false)
    private String name;

    private String topic;

    @OneToMany(mappedBy = "trustGroup",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Member> members = new HashSet<>();

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;

    private int maximumNumOfParticipants = 30;

    private BigDecimal trustGroupLoanAmount;

    @OneToOne(cascade = CascadeType.ALL)
    private Loan loan;
}
