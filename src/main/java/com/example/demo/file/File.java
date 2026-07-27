package com.example.demo.file;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "file")
public class File {  // "Example"을 첫 글자를 대문자로 한 폴더 이름으로 바꾸기

  @Id
  @Column(name = "file_id", nullable = false)
  private Long id;
  private Long uuid;
  @Column(name = "file_name")
  private String fileName;
  @Column(name = "save_dir")
  private String saveDir;
  @Column(name = "file_type")
  private int fileType;
  @Column(name = "file_subtype")
  private int fileSubtype;
  @Column(name = "file_size")
  private Long fileSize;
  @Column(name = "uploaded_at")
  private LocalDateTime uploadedAt;
}
