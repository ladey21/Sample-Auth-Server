package com.dev.sampleauthserver.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TrustGroupDto {

    @NotNull(message = "Trust group name is required")
    private String name;

    private List<String> userEmails;

    @Min(value = 1000, message = "loan amount must be greater than 1000")
    private BigDecimal loanAmount;

    @Min(value = 100, message = "Monthly repayment must be greater than 100")
    private  BigDecimal monthlyRepaymentAmount;

    @NotNull(message = "repayment start date is required")
    @Future(message = "Repayment start date must be in the future")
    private Instant repaymentStartDate;

    @Min(value = 1, message = "Day of the month must be greater than 1")
    @Max(value = 31, message = "Day of the month must be less than 31")
    private Integer monthlyDueDate;
}
