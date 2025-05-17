package com.glowify.glowify_web_service.core.entities;

import java.time.LocalDateTime;

public record Company(
        Long id,
        String identifier,
        String name,
        String slug,
        String email,
        String password,
        LocalDateTime created_at
) {
}
