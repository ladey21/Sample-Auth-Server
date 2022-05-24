package com.dev.sampleauthserver.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.math.BigDecimal;
import java.time.Instant;

@Data
public class NewTransactionDto {
    @NotNull(message = "email can not be null")
    private String email;

    @NotNull(message = "amount cannot be null")
    @Min(value = 1, message = "amount must be greater than 0")
    private BigDecimal amountDue;

    @PastOrPresent(message = "date must be in the past")
    private Instant transactionDate;
}
