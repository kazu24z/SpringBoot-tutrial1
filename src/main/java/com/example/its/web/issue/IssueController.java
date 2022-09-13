package com.example.its.web.issue;

import com.example.its.domain.issue.IssueEntity;
import com.example.its.domain.issue.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 課題ページのコントローラ
 */
@Controller
@RequiredArgsConstructor
public class IssueController {
    private final IssueService issueService;

    /**
     * 課題の一覧を表示する
     * @param model
     * @return http://domain/issuesのページ
     */
    @GetMapping("/issues")
    public String showList(Model model) {
        model.addAttribute("issueList", issueService.findAll());
        return "issues/list";
    }
}
