package com.project.board.controller;

import com.project.board.dto.BoardDTO;
import com.project.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/board") // 대표 주소 설정
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService; // 생성자 주입 방법으로 의존성 주입 받기

    @GetMapping("/save")
    public String saveForm(){
        return "save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO){
        System.out.println("boardDTO = " + boardDTO);
        boardService.save(boardDTO);
        return "index";
    }
}
