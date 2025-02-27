package com.ctw.workstation.service;


import com.ctw.workstation.entity.Rack;
import com.ctw.workstation.entity.RackAsset;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class RackAssetRepository implements PanacheRepository<RackAsset> {

    public List<RackAsset> findByRack(Rack rack) {
        return find("rack", rack).list();
    }

    public RackAsset findById(UUID id) {
        return find("id", id).firstResult();
    }

    @Transactional
    @Path("/rackid")
    public RackAsset addRackAsset(RackAsset rackAsset, @QueryParam("rackId") UUID rackId) {
        if (rackAsset.getId() == null) {
            rackAsset.setId(UUID.randomUUID());
        }

        rackAsset.setRackId(rackId);
        rackAsset.assetTag = "rack_tag - " + rackAsset.getId();
        rackAsset.createdAt = LocalDate.now();
        rackAsset.modifiedAt = LocalDate.now();
        persistAndFlush(rackAsset);
        return rackAsset;
    }

    @DELETE
    @Path("/rackAssetId")
    public boolean deleteRackAsset(@QueryParam("rackId") UUID rackAssetId) {
        RackAsset rackAsset = findById(rackAssetId);
        if(rackAsset == null) {
            return false;
        }
        return delete("id", rackAssetId)>0;

    }

    @Transactional
    public RackAsset updateRackAsset(UUID id, RackAsset updateddata) {
        RackAsset rackAsset = findById(id);
        if(rackAsset == null) {
            throw new EntityNotFoundException("Rack Asset with id " + id + " not found");
        }
        rackAsset.assetTag = updateddata.assetTag;
        rackAsset.rackId = updateddata.rackId;
        rackAsset.modifiedAt = LocalDate.now();
        persistAndFlush(rackAsset);
        return rackAsset;

    }
}
