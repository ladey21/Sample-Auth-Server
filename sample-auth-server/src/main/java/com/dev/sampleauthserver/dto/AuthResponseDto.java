package com.dev.sampleauthserver.dto;

import lombok.Getter;

@Getter
public class AuthResponseDto {
    private final String token;
    private String tokenPrefix = "Bearer";
    private long authTokenDuration = 21;
    private long refreshTokenDuration = 90;
    private String refreshToken;
    private String userFullName;
    private String role;
    private boolean superAdmin;
    private long organizationId;
    private String email;
    private Long id;

    public AuthResponseDto(String token, String refreshToken) {
        this.token = token;
        this.refreshToken = refreshToken;
    }

    public AuthResponseDto(String token, String tokenPrefix, long authTokenDuration, long refreshTokenDuration) {
        this.token = token;
        this.tokenPrefix = tokenPrefix;
        this.authTokenDuration = authTokenDuration;
        this.refreshTokenDuration = refreshTokenDuration;
    }

    public AuthResponseDto(String token, String tokenPrefix, long authTokenDuration, String refreshToken, String userFullName, String role, boolean superAdmin, long organizationId, String email, Long id) {
        this.token = token;
        this.tokenPrefix = tokenPrefix;
        this.authTokenDuration = authTokenDuration;
        this.refreshToken = refreshToken;
        this.userFullName = userFullName;
        this.role = role;
        this.superAdmin = superAdmin;
        this.organizationId = organizationId;
        this.email = email;
        this.id = id;
    }

    public AuthResponseDto(String token) {
        this.token = token;
    }

    public void setTokenPrefix(final String tokenPrefix){
        this.tokenPrefix = tokenPrefix;
    }

    public void setDuration(final long duration){
        this.authTokenDuration = duration;
    }
}
