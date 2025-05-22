package com.glowify.glowify_web_service.main;

import com.glowify.glowify_web_service.application.gateway.ServiceGateway;
import com.glowify.glowify_web_service.application.usecases.serviceUseCases.CreateServiceInterector;
import com.glowify.glowify_web_service.infrastructure.gateways.ServiceRepositoryGateway;
import com.glowify.glowify_web_service.infrastructure.mappers.ServiceEntityMapper;
import com.glowify.glowify_web_service.infrastructure.persistence.repositories.ServiceRepository;
import com.glowify.glowify_web_service.infrastructure.web.dtos.ServiceDTOMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    CreateServiceInterector createServiceCase(ServiceGateway serviceGateway){
        return new CreateServiceInterector(serviceGateway);
    }

    @Bean
    ServiceGateway serviceGateway(ServiceRepository serviceRepository, ServiceEntityMapper serviceEntityMapper){
        return new ServiceRepositoryGateway(serviceRepository, serviceEntityMapper);
    }

    @Bean
    ServiceEntityMapper serviceEntityMapper(){
        return new ServiceEntityMapper();
    }

    @Bean
    ServiceDTOMapper serviceDTOMapper(){
        return new ServiceDTOMapper();
    }

}
