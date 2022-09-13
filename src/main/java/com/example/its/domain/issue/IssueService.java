package com.example.its.domain.issue;

import java.util.List;

/**
* 具体的な課題を生成するクラス
*
*/
public class IssueService {
    /**
     * 課題のリストを生成する
     * @return 課題データのリスト
     */
    public List<IssueEntity> findAll(){
        return List.of(
            new IssueEntity(1,"概要","説明1"),
            new IssueEntity(2,"概要","説明2"),
            new IssueEntity(3,"概要","説明3")
        );
    }
}
