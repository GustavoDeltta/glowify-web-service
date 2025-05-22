package com.glowify.glowify_web_service.application.usecases.serviceUseCases;

import com.glowify.glowify_web_service.application.gateway.ServiceGateway;
import com.glowify.glowify_web_service.core.entities.Service;

public class CreateServiceInterector {

    private ServiceGateway serviceGateway;

    public CreateServiceInterector(ServiceGateway serviceGateway) {
        this.serviceGateway = serviceGateway;
    }

    public Service createService(Service service){
        return serviceGateway.createService(service);
    }

}
