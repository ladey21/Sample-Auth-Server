package com.dev.sampleauthserver.repository;

import com.dev.sampleauthserver.model.Member;
import com.dev.sampleauthserver.model.Organization;
import com.dev.sampleauthserver.repository.projections.AuthProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {
    Optional<Member> findMemberByUserEmail(String email);
    Optional<Member> findMemberByUniqueId(String uniqueId);
    Optional<Member> findMemberByUserEmailAndOrganizationId(String email,Long orgId);
    Optional<Member> findMemberByUserId(Long userId);
    Page<Member> findAllByUserOrganization(Pageable pageable, Organization organization);
    List<Member> findAllByUserOrganization(Organization organization);

    @Query(value = "SELECT u.organization_id as org, u.email, m.id, u.full_name as name from \"member\" m join users u on m.user_id = u.id WHERE u.email =:email",nativeQuery = true)
    AuthProjection getAuthDetails(@Param("email") String email);
}
