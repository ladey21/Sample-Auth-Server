package com.dev.sampleauthserver.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrustGroupResponseDto {
    private String name;
    private BigDecimal trustGroupLoanAmount;
    private List<MemberDetailsResponseDto> members;
}
