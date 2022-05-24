package com.dev.sampleauthserver.dto;

import com.dev.sampleauthserver.enums.MonthlyPaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MonthlySummaryResponseDto {
    private String month;
    private String year;
    private MonthlyPaymentStatus status;
    private BigDecimal totalPaid;
    private BigDecimal amountDue;
    private BigDecimal amountBroughtForward;
    private BigDecimal balance;
    private Instant dueDate;
}
