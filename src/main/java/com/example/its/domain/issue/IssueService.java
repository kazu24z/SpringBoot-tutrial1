package com.example.its.domain.issue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* 具体的な課題を生成するクラス
*
*/
@Service
@RequiredArgsConstructor
public class IssueService {

    private final IssueRepository issueRepository;

    /**
     * 課題のリストを生成する
     * @return 課題データのリスト
     */
    public List<IssueEntity> findAll(){
        return issueRepository.findAll();
    }
}
