package com.almousleck.dtos;

import java.time.Instant;

public record PermissionResponse(
        String name,
        Instant createdAt,
        Instant updatedAt
) {
}
