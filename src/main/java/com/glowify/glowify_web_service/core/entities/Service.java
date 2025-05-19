package com.glowify.glowify_web_service.core.entities;

public class Service{
    private Long id;
    private String identifier;
    private String title;
    private String description;
    private Float price;
    private String iconimg_url;
    private String bannerimg_url;
    private Boolean status;

    public Service(Long id,
                   String identifier,
                   String title,
                   String description,
                   Float price,
                   String iconimg_url,
                   String bannerimg_url,
                   Boolean status){

        this.id = id;
        this.identifier = identifier;
        this.title = title;
        this.description = description;
        this.price = price;
        this.iconimg_url = iconimg_url;
        this.bannerimg_url = bannerimg_url;
        this.status = status;
    }

    public Long getId() { return id; }

    public String getIdentifier() { return identifier; }

    public String getTitle() { return title; }

    public String getDescription() { return description; }

    public Float getPrice() { return price; }

    public String getIconimg_url() { return iconimg_url; }

    public String getBannerimg_url() { return bannerimg_url; }

    public Boolean getStatus() { return status; }
}
