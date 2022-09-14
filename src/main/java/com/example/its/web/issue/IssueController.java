package com.example.its.web.issue;

import com.example.its.domain.issue.IssueEntity;
import com.example.its.domain.issue.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Queue;

/**
 * 課題ページのコントローラ
 */
@Controller
@RequestMapping("/issues")
@RequiredArgsConstructor
public class IssueController {
    private final IssueService issueService;

    /**
     * 課題の一覧を表示する
     * @param model
     * @return http://domain/issuesのページ
     */
    @GetMapping
    public String showList(Model model) {
        model.addAttribute("issueList", issueService.findAll());
        return "issues/list";
    }

    /**
     * 課題作成ページを表示する
     * @return http://domain/issues/creationFormのページ
     */
    @GetMapping("/creationForm")
    public String showCreationForm(@ModelAttribute IssueForm form) {
        return "issues/creationForm";
    }

    /**
     * 課題新規作成処理を実行する
     * @param model
     * @return http://domain/issuesのページ
     */
    @PostMapping
    public String create(@Validated IssueForm form, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return showCreationForm(form);
        }
        issueService.create(form.getSummary(), form.getDescription());
        return "redirect:/issues";
    }

}
