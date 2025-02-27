package com.ctw.workstation.dto;

import com.ctw.workstation.entity.Rack;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class TeamResponseDTO {
    private UUID id;
    private String name;
    private String product;
    private String defaultLocation;
    private LocalDate createdAt;
    private LocalDate modifiedAt;
    private List<Rack> racks;

    public TeamResponseDTO() {}

    public TeamResponseDTO (UUID id, String name, String product, String defaultLocation, LocalDate createdAt, LocalDate modifiedAt, List<Rack> racks) {
        this.id = id;
        this.name = name;
        this.product = product;
        this.defaultLocation = defaultLocation;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.racks = racks;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDefaultLocation() {
        return defaultLocation;
    }

    public void setDefaultLocation(String defaultLocation) {
        this.defaultLocation = defaultLocation;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDate modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public List<Rack> getRacks() {
        return racks;
    }

    public void setRacks(List<Rack> racks) {
        this.racks = racks;
    }
}

