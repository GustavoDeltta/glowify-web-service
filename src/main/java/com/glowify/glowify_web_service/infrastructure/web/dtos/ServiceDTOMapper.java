package com.glowify.glowify_web_service.infrastructure.web.dtos;

import com.glowify.glowify_web_service.core.entities.Service;
import com.glowify.glowify_web_service.infrastructure.web.dtos.serviceDTOS.CreateServiceRequest;
import com.glowify.glowify_web_service.infrastructure.web.dtos.serviceDTOS.CreateServiceResponse;

public class ServiceDTOMapper {
    public CreateServiceResponse toResponse(Service service){
        return new CreateServiceResponse(
                service.title(),
                service.description()
        );
    }
    public Service toService(CreateServiceRequest request){
        return new Service(
                request.id(),
                request.company_id(),
                request.title(),
                request.description(),
                request.price(),
                request.iconimg_url(),
                request.bannerimg_url(),
                request.duration_minutes(),
                request.status(),
                request.created_at()
        );
    }
}
