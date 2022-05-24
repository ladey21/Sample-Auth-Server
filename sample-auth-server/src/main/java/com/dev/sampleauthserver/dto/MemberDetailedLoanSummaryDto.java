package com.dev.sampleauthserver.dto;

import com.dev.sampleauthserver.enums.MonthlyPaymentStatus;
import com.dev.sampleauthserver.enums.PaymentType;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class MemberDetailedLoanSummaryDto {
    private String name;
    private PaymentType paymentType = PaymentType.RENTAL;
    private LocalDate paymentDate;
    private BigDecimal amountPaid;
    private MonthlyPaymentStatus monthlyPaymentStatus;
}
