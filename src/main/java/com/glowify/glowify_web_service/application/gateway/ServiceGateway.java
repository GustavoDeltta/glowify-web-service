package com.glowify.glowify_web_service.application.gateway;

import com.glowify.glowify_web_service.core.entities.Service;

public interface ServiceGateway {
    Service createService(Service service);
}
