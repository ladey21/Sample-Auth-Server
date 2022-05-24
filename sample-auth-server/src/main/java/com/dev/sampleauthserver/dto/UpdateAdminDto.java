package com.dev.sampleauthserver.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
public class UpdateAdminDto {
    private String email;
    private String phone;
    private String fullName;
    private LocalDateTime birthday;
    private String address;
}
