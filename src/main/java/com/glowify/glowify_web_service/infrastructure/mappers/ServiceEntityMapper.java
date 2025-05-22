package com.glowify.glowify_web_service.infrastructure.mappers;

import com.glowify.glowify_web_service.core.entities.Service;
import com.glowify.glowify_web_service.infrastructure.persistence.entities.ServiceEntity;

public class ServiceEntityMapper {

    public ServiceEntity toEntity(Service serviceDomainObj){
        return new ServiceEntity(
                serviceDomainObj.id(),
                serviceDomainObj.company_id(),
                serviceDomainObj.title(),
                serviceDomainObj.description(),
                serviceDomainObj.price(),
                serviceDomainObj.iconimg_url(),
                serviceDomainObj.bannerimg_url(),
                serviceDomainObj.duration_minutes(),
                serviceDomainObj.status(),
                serviceDomainObj.created_at()
        );
    }

    public Service toDomainObj(ServiceEntity serviceEntity){
        return new Service(
                serviceEntity.getId(),
                serviceEntity.getCompany(),
                serviceEntity.getTitle(),
                serviceEntity.getDescription(),
                serviceEntity.getPrice(),
                serviceEntity.getIconImageUrl(),
                serviceEntity.getBannerImageUrl(),
                serviceEntity.getDurationMinutes(),
                serviceEntity.getStatus(),
                serviceEntity.getCreatedAt()
        );
    }

}
