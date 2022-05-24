package com.dev.sampleauthserver.repository;

import com.dev.sampleauthserver.model.MemberDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDocumentRepository extends JpaRepository<MemberDocument,Long> {
}
