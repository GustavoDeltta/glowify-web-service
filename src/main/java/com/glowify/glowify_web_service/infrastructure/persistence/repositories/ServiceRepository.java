package com.glowify.glowify_web_service.infrastructure.persistence.repositories;

import com.glowify.glowify_web_service.infrastructure.persistence.entities.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ServiceRepository extends JpaRepository<ServiceEntity, UUID> {

}
