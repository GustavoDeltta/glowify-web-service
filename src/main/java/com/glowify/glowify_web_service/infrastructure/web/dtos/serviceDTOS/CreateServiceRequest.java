package com.glowify.glowify_web_service.infrastructure.web.dtos.serviceDTOS;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public record CreateServiceRequest(
        UUID id,
        UUID company_id,
        String title,
        String description,
        BigDecimal price,
        String iconimg_url,
        String bannerimg_url,
        Integer duration_minutes,
        Boolean status,
        OffsetDateTime created_at
){
}
