package com.dev.sampleauthserver.model;

import com.dev.sampleauthserver.common.BaseClass;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

@Setter
@Getter
@Entity
@Table(name = "loan")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Loan extends BaseClass {

    private Instant dateDisbursed;

    private BigDecimal amountDisbursed;

    @OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @OrderBy("year DESC, month DESC")
    private SortedSet<MonthlySummary> monthlySummary = new TreeSet<>();

    @OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Transaction> repayments = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    private LoanStructure loanStructure;
}
