package com.dev.sampleauthserver.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
public class TransactionPaymentDto {
    private String fullName;
    private Instant transactionDate;
    private BigDecimal transactionAmount;
    private String status;
    private String email;
    private String paymentType;
}
