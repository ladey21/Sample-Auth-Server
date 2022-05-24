package com.dev.sampleauthserver.dto;

import com.dev.sampleauthserver.model.Address;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberResponseDto {
    private String fullName;
    private String designation;
    private String gender;
    private String email;
    private Address address;
}
