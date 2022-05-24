package com.dev.sampleauthserver.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
public class TransactionResponseDto {
    private String memberFullName;
    private MemberResponseDto memberResponseDto;
    private String trustGroupName;
    private BigDecimal amount;
    private Instant transactionDate;
    private String paymentStatus;
}
