package com.innowise.common.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentCreatedEvent {

    private String paymentId;
    private Long orderId;
    private BigDecimal amount;
    private String status;
    private LocalDateTime timestamp;

}
