package com.example.its.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * トップページのコントローラ
 * return https://domain/のページ
 */
@Controller
public class IndexController {
    // GET /
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
