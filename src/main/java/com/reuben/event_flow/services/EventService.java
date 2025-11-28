package com.reuben.event_flow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reuben.event_flow.dtos.EventRequest;
import com.reuben.event_flow.dtos.EventResponse;
import com.reuben.event_flow.mappers.EventMapper;
import com.reuben.event_flow.models.Event;
import com.reuben.event_flow.repositories.EventRepository;

@Service
public class EventService {
  @Autowired
  EventRepository eventRepository;
  
  public EventResponse createEvent(EventRequest eventRequest) {
    Event event = new Event();
    event.setTitle(eventRequest.title());
    event.setDescription(eventRequest.description());
    event.setLocation(eventRequest.location());
    event.setStartDateTime(eventRequest.startDateTime());
    event.setEndDateTime(eventRequest.endDateTime());
    event.setCapacity(eventRequest.capacity());
    event.setPrice(eventRequest.price());
    event.setStatus(eventRequest.status());
    event.setBannerUrl(eventRequest.bannerUrl());
    event.setOrganizers(eventRequest.organizers());
    Event savedEvent = eventRepository.save(event);

    return EventMapper.toEventResponse(savedEvent);
  }
}
