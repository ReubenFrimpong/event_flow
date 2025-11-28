package com.reuben.event_flow.dtos;

import com.reuben.event_flow.enums.Role;

import jakarta.validation.constraints.NotBlank;

public record AuthRegistrationRequest(@NotBlank String name,@NotBlank String email, @NotBlank String password,@NotBlank Role role, String phoneNumber) {

}
