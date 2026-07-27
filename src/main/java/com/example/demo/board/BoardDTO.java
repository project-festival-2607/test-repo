package com.example.demo.board; // "example"을 폴더 이름으로 바꾸기

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardDTO { // "Example"을 첫 글자를 대문자로 한 폴더 이름으로 바꾸기

    private Long bno;
    private String title;
    private String content;
    private Long viewCount;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    @Builder.Default
    private Boolean highlight = false;

}