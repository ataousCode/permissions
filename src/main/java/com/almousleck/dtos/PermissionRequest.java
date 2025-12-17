package com.almousleck.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record PermissionRequest(
        @NotBlank(message = "Permission name is required")
        @Size(max = 100, message = "Permission name max length 100")
        String name) {}
