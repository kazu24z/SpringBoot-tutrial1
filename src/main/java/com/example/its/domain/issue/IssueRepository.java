package com.example.its.domain.issue;

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
    @Select("select * from issues")
    List<IssueEntity> findAll();
}
