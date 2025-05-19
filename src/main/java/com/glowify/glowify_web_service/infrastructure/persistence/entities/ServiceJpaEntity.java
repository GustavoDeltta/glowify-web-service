package com.glowify.glowify_web_service.infrastructure.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "services")
public class ServiceJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String identifier;

    @Column(nullable = false)
    private String title;

    private String description;

    @Column(nullable = false)
    private Float price;

    private String iconimg_url;

    private String bannerimg_url;

    @Column(nullable = false)
    private Boolean status;

    public ServiceJpaEntity(Long id,
                            String identifier,
                            String title,
                            String description,
                            Float price,
                            String iconimg_url,
                            String bannerimg_url,
                            Boolean status) {
        this.id = id;
        this.identifier = identifier;
        this.title = title;
        this.description = description;
        this.price = price;
        this.iconimg_url = iconimg_url;
        this.bannerimg_url = bannerimg_url;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Float getPrice() {
        return price;
    }

    public String getIconimg_url() {
        return iconimg_url;
    }

    public String getBannerimg_url() {
        return bannerimg_url;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setIconimg_url(String iconimg_url) {
        this.iconimg_url = iconimg_url;
    }

    public void setBannerimg_url(String bannerimg_url) {
        this.bannerimg_url = bannerimg_url;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
