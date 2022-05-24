package com.dev.sampleauthserver.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class AdminResponseDto {
    private String email;
    private Long orgId;
    private  String fullName;
    private Boolean isSuperAdmin;
    private LocalDate birthday;
    private String phone;
    private String gender;
}
