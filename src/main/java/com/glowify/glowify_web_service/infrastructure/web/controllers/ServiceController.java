package com.glowify.glowify_web_service.infrastructure.web.controllers;

import com.glowify.glowify_web_service.core.entities.Service;
import com.glowify.glowify_web_service.core.usecases.serviceUseCases.CreateServiceCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ServiceController {
    private final CreateServiceCase createServiceCase;

    public ServiceController(CreateServiceCase createServiceCase){
        this.createServiceCase = createServiceCase;
    }

    @PostMapping
    public ResponseEntity<Service> create(@RequestBody Service service){
        Service created = createServiceCase.execute(service);
        return ResponseEntity.ok(created);
    }
}
