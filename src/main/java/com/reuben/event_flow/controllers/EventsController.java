package com.reuben.event_flow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.reuben.event_flow.dtos.EventRequest;
import com.reuben.event_flow.dtos.EventResponse;
import com.reuben.event_flow.services.EventService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/api/events")
public class EventsController {
  @Autowired
  private EventService eventService;

  @PostMapping
  public ResponseEntity<EventResponse> createEvent(@Valid @RequestBody EventRequest eventRequest) {
    return ResponseEntity.ok(eventService.createEvent(eventRequest));
  }
  
}
