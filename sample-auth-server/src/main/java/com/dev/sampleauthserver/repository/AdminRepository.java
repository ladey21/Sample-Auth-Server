package com.dev.sampleauthserver.repository;

import com.dev.sampleauthserver.model.Admin;
import com.dev.sampleauthserver.model.User;
import com.dev.sampleauthserver.repository.projections.AuthProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {

    @Query(value = "SELECT u.organization_id as org, u.email,a.id,u.full_name as name,u.\"role\" from \"admin\" a JOIN users u on a.user_id = u.id where u.email=:email", nativeQuery = true)
    AuthProjection getAuthDetails(@Param("email") String email);

    @Query(value = "SELECT * from admin WHERE organization_id =:Id", nativeQuery = true)
    Page<Admin> findAllByUserOrganizationId(Pageable pageable, @Param("Id") Long Id);

    Optional<Admin> findByUser(User user);
}
