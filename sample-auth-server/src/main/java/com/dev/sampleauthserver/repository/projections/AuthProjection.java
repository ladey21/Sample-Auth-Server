package com.dev.sampleauthserver.repository.projections;

public interface AuthProjection {
    String getName();
    Long getOrg();
    String getRole();
    String getEmail();
    Long getId();
}
