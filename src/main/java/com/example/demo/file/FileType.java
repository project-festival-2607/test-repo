package com.example.demo.file;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum FileType {
  // 권한 생성 시 열거형으로 만드는 것이 일반적
  APPLICATION("FILE_TYPE_APPLICATION"),
  AUDIO("FILE_TYPE_AUDIO"),
  IMAGE("FILE_TYPE_IMAGE"),
  TEXT("FILE_TYPE_TEXT"),
  VIDEO("FILE_TYPE_VIDEO"),
  OTHERS("FILE_TYPE_OTHERS");
  ;

  private final String fileType;
}
