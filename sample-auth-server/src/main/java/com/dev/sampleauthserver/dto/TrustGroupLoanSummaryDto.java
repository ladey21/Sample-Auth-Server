package com.dev.sampleauthserver.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;

@Getter
@Setter
public class TrustGroupLoanSummaryDto {
    private Instant startDate;
    private BigDecimal totalAmountLoaned;
    private BigDecimal rentals;
    private BigDecimal unpaidBalance;
    private String trustGroupName;
    private LocalDateTime lastUpdate;
}
