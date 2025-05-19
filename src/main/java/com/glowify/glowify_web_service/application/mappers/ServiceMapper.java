package com.glowify.glowify_web_service.application.mappers;

import com.glowify.glowify_web_service.core.entities.Service;
import com.glowify.glowify_web_service.infrastructure.persistence.entities.ServiceJpaEntity;

public class ServiceMapper {

    public static ServiceJpaEntity toJpaEntity(Service service){
        return new ServiceJpaEntity(
                service.getId(),
                service.getIdentifier(),
                service.getTitle(),
                service.getDescription(),
                service.getPrice(),
                service.getIconimg_url(),
                service.getBannerimg_url(),
                service.getStatus()
        );
    }

    public static Service toDomain(ServiceJpaEntity entity){
        return new Service(
                entity.getId(),
                entity.getIdentifier(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getPrice(),
                entity.getIconimg_url(),
                entity.getBannerimg_url(),
                entity.getStatus()
        );
    }

}
