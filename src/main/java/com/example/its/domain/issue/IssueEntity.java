package com.example.its.domain.issue;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 「課題」のエンティティ（データ雛形）
 */
@AllArgsConstructor
@Data
public class IssueEntity {
    private long id;
    private String summary;
    private String description;
}
