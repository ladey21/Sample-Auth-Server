package com.dev.sampleauthserver.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddMemberToTrustGroupDto {
    private Long userId;
    private Long trustGroup;
}
