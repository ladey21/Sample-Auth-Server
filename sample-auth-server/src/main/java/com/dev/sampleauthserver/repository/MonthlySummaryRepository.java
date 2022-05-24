package com.dev.sampleauthserver.repository;

import com.dev.sampleauthserver.model.MonthlySummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthlySummaryRepository extends JpaRepository<MonthlySummary, Long> {
}
