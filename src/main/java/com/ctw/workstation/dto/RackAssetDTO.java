package com.ctw.workstation.dto;

import com.ctw.workstation.entity.RackAsset;

import java.time.LocalDate;
import java.util.UUID;

public class RackAssetDTO {
    public String assetTag;
    public UUID rackId;
    public LocalDate createdAt;
    public LocalDate modifiedAt;

    public static RackAssetDTO fromEntity(RackAsset rackAsset) {
        RackAssetDTO dto = new RackAssetDTO();
        dto.assetTag = rackAsset.getAssetTag();
        dto.rackId = rackAsset.getRackId();
        dto.createdAt = rackAsset.getCreatedAt();
        dto.modifiedAt = rackAsset.getModifiedAt();
        return dto;
    }

    public RackAsset torackAsset(){
        RackAsset rackAsset = new RackAsset();
        rackAsset.setAssetTag(this.assetTag);
        rackAsset.setRackId(this.rackId);
        rackAsset.setCreatedAt(this.createdAt);
        rackAsset.setModifiedAt(this.modifiedAt);
        return rackAsset;
    }

}
