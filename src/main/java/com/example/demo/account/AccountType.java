package com.example.demo.account;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AccountType {
  // 권한 생성 시 열거형으로 만드는 것이 일반적
  ADMIN("ROLE_ADMIN"),
  RECRUITER("ROLE_RECRUITER"),
  JOB_SEEKER("ROLE_JOB_SEEKER");

  private final String accountType;
}
