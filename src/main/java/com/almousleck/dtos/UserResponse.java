package com.almousleck.dtos;

import java.time.Instant;
import java.util.Set;

public record UserResponse(
        String email,
        boolean enabled,
        Instant createdAt,
        Instant updatedAt,
        Set<String> roles
) {
}
