package com.dev.sampleauthserver.model;

import com.dev.sampleauthserver.common.BaseClass;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "enquiry")
@EqualsAndHashCode(callSuper = true)
public class Enquiry extends BaseClass {
    private Long userId;
    private Long orgId;
    private String name;
    private String email;
    private String enquiry;
}
