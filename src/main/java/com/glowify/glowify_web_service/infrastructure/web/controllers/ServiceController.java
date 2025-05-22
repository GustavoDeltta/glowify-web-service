package com.glowify.glowify_web_service.infrastructure.web.controllers;

import com.glowify.glowify_web_service.application.usecases.serviceUseCases.CreateServiceInterector;
import com.glowify.glowify_web_service.core.entities.Service;
import com.glowify.glowify_web_service.infrastructure.web.dtos.serviceDTOS.CreateServiceRequest;
import com.glowify.glowify_web_service.infrastructure.web.dtos.serviceDTOS.CreateServiceResponse;
import com.glowify.glowify_web_service.infrastructure.web.dtos.ServiceDTOMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ServiceController {
    private final CreateServiceInterector createServiceInterector;
    private final ServiceDTOMapper serviceDTOMapper;

    public ServiceController(CreateServiceInterector createServiceInterector, ServiceDTOMapper serviceDTOMapper){
        this.createServiceInterector = createServiceInterector;
        this.serviceDTOMapper = serviceDTOMapper;
    }

    @PostMapping("/create")
    CreateServiceResponse create(@RequestBody CreateServiceRequest request){
        Service serviceBusinessObj = serviceDTOMapper.toService(request);
        Service service = createServiceInterector.createService(serviceBusinessObj);
        return serviceDTOMapper.toResponse(service);
    }
}
