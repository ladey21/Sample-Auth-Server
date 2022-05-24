package com.dev.sampleauthserver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnquiryDto {
    private String enquiry;
    private String email;
    private String fullName;
}
