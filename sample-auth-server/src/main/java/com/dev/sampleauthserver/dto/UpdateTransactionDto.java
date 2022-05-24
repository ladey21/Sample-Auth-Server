package com.dev.sampleauthserver.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UpdateTransactionDto {
    private Long transactionId;
    private BigDecimal amountDue;
    private String paymentStatus;
}
