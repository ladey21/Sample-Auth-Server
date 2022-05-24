package com.dev.sampleauthserver.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
public class NewMemberDto {

    @NotNull
    @Email(message = "Email is not properly formatted")
    private String email;

    @NotNull
    private String addressLine;

    @NotNull
    private LocalDate dateOfBirth;

    @NotNull
    private String fullName;

    @NotNull
    private  String termsAndConditionUrl;

    @NotNull
    private String loanRestructureUrl;

    @NotNull
    private String approvalLetterUrl;


    @NotNull
    @PhoneValidator
    private String phone;

    private Long trustGroupId;

    private String gender;

    private String designation;
}
