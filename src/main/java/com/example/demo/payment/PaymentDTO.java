package com.example.demo.payment;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentDTO {

    private int paymentId;
    private int id2;
    private int productId2; //??????????????
    private int payedNum;
    private int productId;
    private int paymentMethodId;
    private String paymentKey;
    private String orderId;
    private String orderName;
    private int totalAmount;
    private int returnableAmount;
    private String paymentStatus;
    private LocalDateTime requestingPayment;
    private LocalDateTime approvedPayment;
    private LocalDateTime createdPayment;
    private LocalDateTime updatedPayment;

}
