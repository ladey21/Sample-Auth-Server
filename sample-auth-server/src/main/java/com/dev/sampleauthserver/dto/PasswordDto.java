package com.dev.sampleauthserver.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class PasswordDto {
    @Email
    @NotNull
    private String userEmail;

    @NotNull
    private String password;
}
