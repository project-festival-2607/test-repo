package com.example.demo.file; // "example"을 폴더 이름으로 바꾸기

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileDTO { // "Example"을 첫 글자를 대문자로 한 폴더 이름으로 바꾸기

  private Long id;
  private String uuid;
  private String fileName;
  private String saveDir;
  private FileType fileType;
  private String fileSubtype;
  private Long fileSize;
  private LocalDateTime uploadedAt;
}