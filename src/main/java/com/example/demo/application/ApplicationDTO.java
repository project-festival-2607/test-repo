package com.example.demo.application; // "example"을 폴더 이름으로 바꾸기

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApplicationDTO { // "Example"을 첫 글자를 대문자로 한 폴더 이름으로 바꾸기

  private Long applyId; // 지원 아이디
  private Long id; // uid
  private Long recruitId; // 모집공고 아이디
  private Long resumeId; // 이력서 아이디
  private LocalDateTime registerDate; // 지원일시
  private LocalDateTime readDate; // 열람일시
  private ApplicationStatus result; // 결과
}