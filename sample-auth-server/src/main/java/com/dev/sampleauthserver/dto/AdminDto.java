package com.dev.sampleauthserver.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class AdminDto {

    @Email(message = "email not in proper format")
    private  String email;

    @NotNull
    private String fullName;

    @NotNull
    private  String phoneNo;
}
