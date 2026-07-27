package com.example.demo.application;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Application {  // "Example"을 첫 글자를 대문자로 한 폴더 이름으로 바꾸기

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long applyId; // 지원 아이디

  @Column
  private Long id; // uid

  @Column
  private String recruitId; // 모집공고 아이디

  @Column
  private String resumeId; // 이력서 아이디

  @Column
  private LocalDateTime registerDate; // 지원일시

  @Column
  private LocalDateTime readDate; // 열람일시

  @Column
  @Enumerated(EnumType.STRING)
  private Application result; // 결과
}
