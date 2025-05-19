package com.glowify.glowify_web_service.infrastructure.repositories;

import com.glowify.glowify_web_service.core.entities.Service;
import com.glowify.glowify_web_service.core.repositories.ServiceRepository;
import com.glowify.glowify_web_service.infrastructure.persistence.repositories.ServiceJpaRepository;

public class ServiceRepositoryImpl implements ServiceRepository {

    private final ServiceJpaRepository jpaRepository;

    public ServiceRepositoryImpl(ServiceJpaRepository jpaRepository){
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Service save(Service service) {
        return null;
    }
}
