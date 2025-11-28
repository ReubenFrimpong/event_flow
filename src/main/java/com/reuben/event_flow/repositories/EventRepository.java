package com.reuben.event_flow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reuben.event_flow.models.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

  
} 