package com.dev.sampleauthserver.model;

import com.dev.sampleauthserver.common.BaseClass;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Member extends BaseClass {

    @JsonIgnore
    @OneToOne
    private User user;

    @NotNull
    private Boolean isProfileUpdated = false;

    @Column(unique = true)
    private String nin;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate dateOfBirth;

    @Column(unique = true)
    private String bvn;

    private String nextOfKin;

    @Column(length = 15)
    private String nextOfKinPhoneNumber;

    private Boolean isVerified = false;

    private String uniqueId;

    private String designation;

    @OneToOne
    private Address address;

    @ManyToOne(cascade = CascadeType.ALL)
    private Organization organization;

    @OneToOne
    private MemberDocument document;

    @ManyToOne(cascade = CascadeType.ALL)
    private TrustGroup trustGroup;

    @OneToOne(cascade = CascadeType.ALL)
    private Loan loan;

    @ManyToOne
    private Finance finance;
}
