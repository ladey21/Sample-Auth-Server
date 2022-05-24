package com.dev.sampleauthserver.repository;

import com.dev.sampleauthserver.model.LoanRepaymentDate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoanRepaymentDatesRepository extends JpaRepository<LoanRepaymentDate,Long> {
    Optional<LoanRepaymentDate> findByDayOfMonth(Integer day);
}
