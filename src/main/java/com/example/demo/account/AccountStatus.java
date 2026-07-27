package com.example.demo.account;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AccountStatus {
  // 권한 생성 시 열거형으로 만드는 것이 일반적
  ACTIVE("STATUS_ACTIVE"),
  DORMANT("STATUS_DORMANT"),
  SUSPENDED("STATUS_SUSPENDED");

  private final String accountStatus;
}
