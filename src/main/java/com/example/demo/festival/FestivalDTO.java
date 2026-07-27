package com.example.demo.festival;

import lombok.*;

import java.math.BigDecimal;
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
    private BigDecimal mapX;
    private BigDecimal mapY;
    private String zipCode;
    private String telNum;
    private String fesInfo;
}
