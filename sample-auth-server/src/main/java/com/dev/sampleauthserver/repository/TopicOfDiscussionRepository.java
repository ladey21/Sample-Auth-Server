package com.dev.sampleauthserver.repository;

import com.dev.sampleauthserver.model.TopicOfDiscussion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TopicOfDiscussionRepository extends JpaRepository<TopicOfDiscussion,Long> {
    Optional<TopicOfDiscussion> findTopicOfDiscussionByMessage(String message);
}
