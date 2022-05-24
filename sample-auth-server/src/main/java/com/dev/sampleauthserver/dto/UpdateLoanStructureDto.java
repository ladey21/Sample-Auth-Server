package com.dev.sampleauthserver.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateLoanStructureDto {
    private BigDecimal monthlyRepaymentAmount;
    private  Integer monthlyDueDate;
}
