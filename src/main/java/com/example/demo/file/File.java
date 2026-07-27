package com.example.demo.file;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class File {  // "Example"을 첫 글자를 대문자로 한 폴더 이름으로 바꾸기

  @Id
  private Long id;
}
