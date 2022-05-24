package com.dev.sampleauthserver.dto;

import com.dev.sampleauthserver.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDetailsResponseDto {
    private String email;
    private String fullName;
    private Gender gender;
    private String status;
    private LocalDateTime createdAt;
    private String phoneNumber;
    private String address;
    private LocalDate dateOfBirth;
    private String bvn;
    private String nextOfKin;
    private String nin;
    private String idUrl;
    private String tcUrl;
    private String loanUrl;
    private Long userId;
    private String avatarUrl;
    private String title;
    private String designation;
}
