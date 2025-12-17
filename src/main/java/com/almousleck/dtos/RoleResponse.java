package com.almousleck.dtos;

import java.time.Instant;
import java.util.Set;

public record RoleResponse(
        String name,
        Instant createdAt,
        Instant updatedAt,
        Set<String> permissions
) {
}
