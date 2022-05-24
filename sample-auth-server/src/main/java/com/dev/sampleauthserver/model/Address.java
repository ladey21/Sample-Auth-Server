package com.dev.sampleauthserver.model;

import com.dev.sampleauthserver.common.BaseClass;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Address extends BaseClass {
    private String addressLine;
}
