package com.project.board.dto;

import lombok.*;

import java.time.LocalDateTime;

// DTO(Date Transfer Object) : 데이터를 전송할 때 사용하는 객체(html의 form -> controller)

@Getter
@Setter
@ToString
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits; // 게시글의 조회수
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdatedTime;
}
