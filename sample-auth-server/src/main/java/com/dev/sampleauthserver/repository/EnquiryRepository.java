package com.dev.sampleauthserver.repository;

import com.dev.sampleauthserver.model.Enquiry;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry,Long> {
    Page<Enquiry> findAllByOrgId(Long orgId, Pageable pageable);
}
