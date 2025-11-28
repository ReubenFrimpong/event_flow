package com.reuben.event_flow.dtos;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import com.reuben.event_flow.enums.EventStatus;
import com.reuben.event_flow.models.User;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record EventRequest(
  Long id,
  @NotBlank String title,
  @NotBlank String description,
  @NotBlank String location,
  @NotBlank Timestamp startDateTime,
  @NotBlank Timestamp endDateTime,
  @NotBlank String capacity,
  @NotBlank BigDecimal price,
  @NotBlank EventStatus status,
  @NotEmpty List<User> organizers,
  @NotBlank String bannerUrl
) {

}
