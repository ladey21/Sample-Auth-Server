package com.dev.sampleauthserver.repository;

import com.dev.sampleauthserver.model.LoanStructure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanStructureRepository extends JpaRepository<LoanStructure,Long> {
}
