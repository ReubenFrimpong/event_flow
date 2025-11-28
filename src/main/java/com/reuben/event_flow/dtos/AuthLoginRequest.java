package com.reuben.event_flow.dtos;

import jakarta.validation.constraints.NotBlank;

public record AuthLoginRequest(@NotBlank String name, @NotBlank String password) {

}
