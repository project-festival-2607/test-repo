package com.example.demo.festival;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Festival {
    @Id
    @Column(name = "content_id")
    private long contentId;
    private String title;
    private String address;
    @Column(name = "content_type")
    private int contentType;
    @Column(name = "start_date")
    private LocalDateTime startDate;
    @Column(name = "end_date")
    private LocalDateTime endDate;
    @Column(name = "map_x", precision = 11, scale = 6)
    private BigDecimal mapX;
    @Column(name = "map_y", precision = 10, scale = 6)
    private BigDecimal mapY;
    @Column(name = "zip_code")
    private String zipCode;
    @Column(name = "tel_num")
    private String telNum;
    @Column(name = "fes_info")
    private String fesInfo;
}
