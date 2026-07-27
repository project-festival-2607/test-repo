package com.example.demo.application;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ApplicationStatus {
  // 권한 생성 시 열거형으로 만드는 것이 일반적
  APPLIED("APPLIED"),
  ACCEPTED("ACCEPTED"),
  REJECTED("REJECTED");

  private final String applicationStatus;
}
