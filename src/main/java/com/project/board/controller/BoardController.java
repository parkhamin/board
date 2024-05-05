package com.project.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board") // 대표 주소 설정
public class BoardController {
    @GetMapping("/save")
    public String saveForm(){
        return "save";
    }
}
