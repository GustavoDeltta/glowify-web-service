package com.glowify.glowify_web_service.core.repositories;

import com.glowify.glowify_web_service.core.entities.Service;

public interface ServiceRepository {
    Service save(Service service);
}
