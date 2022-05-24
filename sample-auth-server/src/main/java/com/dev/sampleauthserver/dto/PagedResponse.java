package com.dev.sampleauthserver.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PagedResponse {

    @Builder.Default
    List<?> content = new ArrayList<>();
    int totalPages;
    long totalElements;
    int numberOfElements;
    boolean last;
    boolean first;
    boolean empty;
}
