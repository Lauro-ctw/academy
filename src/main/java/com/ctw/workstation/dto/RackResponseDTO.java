package com.ctw.workstation.dto;

import com.ctw.workstation.Status;

import java.time.LocalDate;
import java.util.UUID;

public class RackResponseDTO {
    private UUID id;
    private String serialNumber;
    private LocalDate createdAt;
    private LocalDate modifiedAt;
    private Status status;
    public String defaultLocation;
    private UUID teamId;

    public RackResponseDTO() {}

    public RackResponseDTO(UUID id, String serialNumber, LocalDate createdAt, LocalDate modifiedAt, Status status, String defaultLocation/*, UUID teamId*/) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.status = status;
        this.defaultLocation = defaultLocation;
        //this.teamId = teamId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
/*
    public UUID getTeamId() {
        return teamId;
    }



    public void setTeamId(UUID teamId) {
        this.teamId = teamId;
    }

 */

    public String getDefaultLocation() {
        return defaultLocation;
    }

    public void setDefaultLocation(String defaultLocation) {
        this.defaultLocation = defaultLocation;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDate modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
