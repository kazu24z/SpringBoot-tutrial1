package com.example.its.domain.issue;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 「課題」のリポジトリ層を作成
 */
@Mapper
@Repository
public interface IssueRepository {

    /**
     * 課題の一覧を取得
     * @return IssueEntityのリスト
     */
    @Select("SELECT * FROM issues")
    List<IssueEntity> findAll();

    /**
     * 課題の追加(DB保存）
     * @param summary
     * @param description
     */
    @Insert("INSERT INTO issues (summary,description) VALUES (#{summary}, #{description})")
    void insert(String summary, String description);
}
