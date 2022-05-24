package com.dev.sampleauthserver.dto;

import com.dev.sampleauthserver.model.AdminOrMember;
import com.dev.sampleauthserver.model.Organization;
import lombok.Data;

@Data
public class UserInfoDto {
    private Organization organization;
    private AdminOrMember adminOrMember;
}
