package com.example.demo.festival;

import lombok.*;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class FestivalDTO {
    private String contentId;
    private String title;
    private String address;
    private int contentType;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int mapX;
    private int mapY;
    private String zipCode;
    private String telNum;
    private String fesInfo;
}
