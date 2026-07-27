package com.example.demo.file;

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
@Table(name = "file")
public class File {  // "Example"을 첫 글자를 대문자로 한 폴더 이름으로 바꾸기

  @Id
  @Column(name = "file_id", nullable = false)
  private Long id;
  @Column(length = 36)
  private String uuid;
  @Column(name = "file_name", length = 225)
  private String fileName;
  @Column(name = "save_dir", length = 225)
  private String saveDir;
  @Enumerated(EnumType.STRING)
  @Column(name = "file_type", length = 15)
  private FileType fileType;
  @Column(name = "file_subtype", length = 100)
  private String fileSubtype;
  @Column(name = "file_size")
  private Long fileSize;
  @Column(name = "uploaded_at")
  private LocalDateTime uploadedAt;
}
