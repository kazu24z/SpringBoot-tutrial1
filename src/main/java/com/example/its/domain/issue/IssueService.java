package com.example.its.domain.issue;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

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
    public List<IssueEntity> findAll() {
        return issueRepository.findAll();
    }

    /**
     * 課題をDBに登録する
     * @param summary
     * @param description
     */
    @Transactional
    public  void create(String summary, String description) {
        issueRepository.insert(summary, description);
    }

    /**
     * 特定の課題を取得する
     * @param issueId
     * @return IssueModel
     */
    public IssueEntity findById(long issueId) {
        return issueRepository.findById(issueId);
    }
}
