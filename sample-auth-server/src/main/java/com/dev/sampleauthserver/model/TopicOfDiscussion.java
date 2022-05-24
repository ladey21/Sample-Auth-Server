package com.dev.sampleauthserver.model;

import com.dev.sampleauthserver.common.BaseClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TopicOfDiscussion extends BaseClass {
    private String message;

    private LocalDateTime dateAndTimeCreated;

    @ManyToOne
    private User user;
}
