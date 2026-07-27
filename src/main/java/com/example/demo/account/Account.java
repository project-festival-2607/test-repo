package com.example.demo.account;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import com.example.demo.account.AccountStatus;
import com.example.demo.account.AccountType;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {

    @Id
    private Long id;    // pk
    private String password_hash;   // 패스워드 해시
    private String username;    // 아이디
    private String name;    // 이름
    private String phone;   // 전화번호
    @Column(name = "phone_verified")
    private boolean phoneVerified;  // 전화번호 인증여부
    private String email;   // 이메일

    @Enumerated(EnumType.STRING)
    @Column(name = "account_type")
    private AccountType accountType; // 계정유형

    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;  // 계정상태

    @Column(name = "created_at")
    private LocalDateTime createdAt;    // 생성일
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;    // 수정일
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;    // 탈퇴일
}
