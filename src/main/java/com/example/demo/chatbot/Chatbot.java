package com.example.demo.chatbot;


import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Chatbot {

    @id
    private Long id;
}
