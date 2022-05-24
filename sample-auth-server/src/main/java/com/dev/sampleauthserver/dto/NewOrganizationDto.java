package com.dev.sampleauthserver.dto;


import lombok.*;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewOrganizationDto {
    private OrganizationDto organization;
    private AdminDto admin;
}
