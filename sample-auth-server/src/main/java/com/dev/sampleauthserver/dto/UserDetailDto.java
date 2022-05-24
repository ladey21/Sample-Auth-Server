package com.dev.sampleauthserver.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailDto {
    private String address;
    private  String nin;
    private String bvn;
    private  String nextOfKin;
    private String nextOfKinPhoneNumber;
    private String approvalLetterUrl;
    private String avatarUrl;
}
