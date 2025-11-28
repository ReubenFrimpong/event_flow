package com.reuben.event_flow.models;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import com.reuben.event_flow.enums.EventStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Event extends BaseEntity {

  @Column(nullable = false)
  private String title;

  private String description;

  @Column(nullable = false)
  private String location;

  @Column(nullable = false)
  private Timestamp startDateTime;

  @Column(nullable = false)
  private Timestamp endDateTime;

  @Column(nullable = false)
  private String capacity;

  @Column(nullable = false)
  private BigDecimal price;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private EventStatus status;

  @Column(nullable = false)
  private String bannerUrl;

  @ManyToOne
  @JoinColumn(name = "organizer_id", nullable = false)
  private List<User> organizers;
}
