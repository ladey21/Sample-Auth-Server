package com.dev.sampleauthserver.repository;

import com.dev.sampleauthserver.model.Finance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinanceRepository extends JpaRepository<Finance,Long> {
}
