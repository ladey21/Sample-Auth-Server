package com.dev.sampleauthserver.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoanSummaryDto {
    private String status;
    private String month;
    private String year;
    private BigDecimal amountPaid = BigDecimal.ZERO;
    private BigDecimal amountDue = BigDecimal.ZERO;
    private BigDecimal amountBroughtForward = BigDecimal.ZERO;
    private BigDecimal balance = BigDecimal.ZERO;
    private int defaultedLoanCount;
}
