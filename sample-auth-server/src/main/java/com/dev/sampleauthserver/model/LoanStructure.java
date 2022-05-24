package com.dev.sampleauthserver.model;

import com.dev.sampleauthserver.common.BaseClass;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "loan_structure")
public class LoanStructure extends BaseClass {

    private BigDecimal monthlyRepaymentAmount;
    private Instant repaymentStartDate;
    private Integer monthlyDueDate;
}
