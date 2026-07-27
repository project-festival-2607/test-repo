package com.example.demo.festival;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

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
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "map_x")
    private int mapX;
    @Column(name = "map_y")
    private int mapY;
    @Column(name = "zip_code")
    private String zipCode;
    @Column(name = "tel_num")
    private String telNum;
    @Column(name = "fes_info")
    private String fesInfo;
}
