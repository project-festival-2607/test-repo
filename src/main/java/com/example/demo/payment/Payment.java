package com.example.demo.payment;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "payment")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payment {

    @Id
    @Column(name = "payment_id")
    private Long paymentId;

    @Column(name = "id2")
    private Long id2;

    @Column(name = "product_id2")
    private int productId2;

    @Column(name = "payed_num")
    private int payedNum;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "payment_method_id")
    private int paymentMethodId;

    @Column(name = "payment_key")
    private String paymentKey;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_name")
    private String orderName;

    @Column(name = "total_amount")
    private int totalAmount;

    @Column(name = "returnable_amount")
    private int returnableAmount;

    @Column(name = "payment_status")
    private String paymentStatus;

    @Column(name = "requesting_payment")
    private LocalDateTime requestingPayment;

    @Column(name = "approved_payment")
    private LocalDateTime approvedPayment;

    @Column(name = "created_payment")
    private LocalDateTime createdPayment;

    @Column(name = "updated_payment")
    private LocalDateTime updatedPayment;
}