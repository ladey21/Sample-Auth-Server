package com.dev.sampleauthserver.model;

import com.dev.sampleauthserver.common.BaseClass;
import com.dev.sampleauthserver.enums.PaymentType;
import com.dev.sampleauthserver.enums.TransactionStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class Transaction extends BaseClass {

    private BigDecimal amount;

    @JsonIgnore
    @ManyToOne
    private Member member;

    @JsonIgnore
    @ManyToOne
    private TrustGroup trustGroup;

    @JsonIgnore
    @ManyToOne
    private Organization organization;

    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus;

    private Instant transactionDate;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @JsonIgnore
    @Cascade(CascadeType.SAVE_UPDATE)
    @ManyToOne
    @JoinColumn(name = "transaction_id")
    private Loan loan;

    @ManyToOne
    @JsonIgnore
    private Finance finance;

    private Boolean memberSummaryProcessed = false;

    private Boolean trustGroupSummaryProcessed = false;
}
