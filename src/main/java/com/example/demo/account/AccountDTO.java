package com.example.demo.account;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDTO {

    private Long id;    // pk
    private String passwordHash;   // 패스워드 해시
    private String username;    // 아이디
    private String name;    // 이름
    private String phone;   // 전화번호
    private boolean phoneVerified;  // 전화번호 인증여부
    private String email;   // 이메일
    private AccountType accountType; // 계정유형
    private AccountStatus accountStatus;  // 계정상태
    private LocalDateTime createdAt;    // 생성일
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
