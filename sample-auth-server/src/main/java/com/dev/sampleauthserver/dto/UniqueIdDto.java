package com.dev.sampleauthserver.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class UniqueIdDto {

    @NotNull
    private String uniqueId;

    @Email
    private String email;

    @NotNull
    private String password;
}
