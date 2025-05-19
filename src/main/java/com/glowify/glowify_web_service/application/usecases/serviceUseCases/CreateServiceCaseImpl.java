package com.glowify.glowify_web_service.application.usecases.serviceUseCases;

import com.glowify.glowify_web_service.core.entities.Service;
import com.glowify.glowify_web_service.core.repositories.ServiceRepository;
import com.glowify.glowify_web_service.core.usecases.serviceUseCases.CreateServiceCase;

public class CreateServiceCaseImpl implements CreateServiceCase {

    private final ServiceRepository serviceRepository;

    public CreateServiceCaseImpl(ServiceRepository serviceRepository){
        this.serviceRepository = serviceRepository;
    }

    @Override
    public Service execute(Service service) {
        return serviceRepository.save(service);
    }
}
