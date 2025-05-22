package com.glowify.glowify_web_service.infrastructure.gateways;

import com.glowify.glowify_web_service.application.gateway.ServiceGateway;
import com.glowify.glowify_web_service.core.entities.Service;
import com.glowify.glowify_web_service.infrastructure.mappers.ServiceEntityMapper;
import com.glowify.glowify_web_service.infrastructure.persistence.entities.ServiceEntity;
import com.glowify.glowify_web_service.infrastructure.persistence.repositories.ServiceRepository;

public class ServiceRepositoryGateway implements ServiceGateway {

    private final ServiceRepository serviceRepository;
    private final ServiceEntityMapper serviceEntityMapper;

    public ServiceRepositoryGateway(ServiceRepository serviceRepository, ServiceEntityMapper serviceEntityMapper) {
        this.serviceRepository = serviceRepository;
        this.serviceEntityMapper = serviceEntityMapper;
    }

    @Override
    public Service createService(Service serviceDomainObj) {
        ServiceEntity serviceEntity = serviceEntityMapper.toEntity(serviceDomainObj);
        ServiceEntity savedObj = serviceRepository.save(serviceEntity);
        return serviceEntityMapper.toDomainObj(savedObj);
    }

}
