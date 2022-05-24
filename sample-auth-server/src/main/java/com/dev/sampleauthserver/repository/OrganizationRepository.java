package com.dev.sampleauthserver.repository;

import com.dev.sampleauthserver.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization,Long> {
    Optional<Organization> findByName(String orgName);
    Optional<Organization> findOrganizationById(Long orgId);
}
