package com.glowify.glowify_web_service.infrastructure.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "services")
public class ServiceEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private UUID company;

    @Column(nullable = false)
    private String title;

    private String description;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "iconimg_url")
    private String iconImageUrl;

    @Column(name = "bannerimg_url")
    private String bannerImageUrl;

    @Column(name = "duration_minutes")
    private Integer durationMinutes;

    @Column(nullable = false)
    private Boolean status;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private OffsetDateTime createdAt;

    public ServiceEntity(UUID id, UUID company, String title, String description, BigDecimal price, String iconImageUrl, String bannerImageUrl, Integer durationMinutes, Boolean status, OffsetDateTime createdAt) {
        this.id = id;
        this.company = company;
        this.title = title;
        this.description = description;
        this.price = price;
        this.iconImageUrl = iconImageUrl;
        this.bannerImageUrl = bannerImageUrl;
        this.durationMinutes = durationMinutes;
        this.status = status;
        this.createdAt = createdAt;
    }

}
