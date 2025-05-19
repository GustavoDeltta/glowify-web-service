package com.glowify.glowify_web_service.core.usecases.serviceUseCases;

import com.glowify.glowify_web_service.core.entities.Service;

public interface CreateServiceCase {
    Service execute(Service service);
}
