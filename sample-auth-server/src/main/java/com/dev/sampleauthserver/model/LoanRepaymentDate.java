package com.dev.sampleauthserver.model;

import com.dev.sampleauthserver.common.BaseClass;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Builder
@Setter
@Getter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LoanRepaymentDate extends BaseClass {

    @Column(name = "day_of_month",unique = true)
    private Integer dayOfMonth;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Loan> loans = new ArrayList<>();
}
