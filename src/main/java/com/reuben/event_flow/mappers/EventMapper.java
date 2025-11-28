package com.reuben.event_flow.mappers;

import com.reuben.event_flow.dtos.EventResponse;
import com.reuben.event_flow.models.Event;

public class EventMapper {
  public static EventResponse toEventResponse(Event event) {
    return new EventResponse(
      event.getId(),
      event.getTitle(),
      event.getDescription(),
      event.getLocation(),
      event.getStartDateTime(),
      event.getEndDateTime(),
      event.getCapacity(),
      event.getPrice(),
      event.getStatus(),
      event.getOrganizers(),
      event.getBannerUrl()
    );
  }
}
