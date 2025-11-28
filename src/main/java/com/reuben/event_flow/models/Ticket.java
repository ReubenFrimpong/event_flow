package com.reuben.event_flow.models;

import java.math.BigDecimal;
import java.security.Timestamp;

import com.reuben.event_flow.enums.EventStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Ticket extends BaseEntity {
  @Column(nullable = false)
  private String ticketCode;

  @OneToOne
  @JoinColumn(name = "event_id", nullable = false)
  private Event event;

  @OneToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  @Column(nullable = false)
  private BigDecimal pricePaid;

  @Column(nullable = false)
  private Timestamp purchaseDate;

  @Enumerated(EnumType.STRING)
  private EventStatus status;

  private String seatNumber;
}
