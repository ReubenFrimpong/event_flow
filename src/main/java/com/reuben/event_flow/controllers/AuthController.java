package com.reuben.event_flow.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reuben.event_flow.dtos.AuthRegistrationRequest;
import com.reuben.event_flow.dtos.AuthResponse;
import com.reuben.event_flow.models.User;
import com.reuben.event_flow.services.AuthService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/auth")

public class AuthController {
  @Autowired
  private AuthService authService;

  @PostMapping("/login")
  public ResponseEntity<AuthResponse> login(@Valid @RequestBody AuthRegistrationRequest request) {
    return ResponseEntity.ok(authService.login(request));
  }

  @PostMapping("/register")
  public ResponseEntity<User> createUser(@Valid @RequestBody AuthRegistrationRequest authRequest) {
    return ResponseEntity.ok(authService.register(authRequest));
  }
  
}
