package com.reuben.event_flow.dtos;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import com.reuben.event_flow.enums.EventStatus;
import com.reuben.event_flow.models.User;

public record EventResponse(
  Long id, 
  String title, 
  String description, 
  String location, 
  Timestamp startDateTime, 
  Timestamp endDateTime,
  String capacity,
  BigDecimal price,
  EventStatus status,
  List<User> organizers,
  String bannerUrl
) {

}
