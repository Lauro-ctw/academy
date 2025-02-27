package com.ctw.workstation.resource;

import com.ctw.workstation.dto.RackAssetDTO;
import com.ctw.workstation.entity.RackAsset;
import com.ctw.workstation.service.RackAssetRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

//@Path("/rackAssets")
//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
public class RackAssetResource {

    /*@Inject
    RackAssetRepository rackAssetRepository;*/

    /*
    @GET
    public Response getAllRackAssets() {
        List<RackAsset> rackAssets = rackAssetRepository.listAll();
        if (rackAssets.isEmpty()) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.status(Response.Status.FOUND).build();
    }*/
/*
    @GET
    public List<RackAssetDTO> getRackAssets() {
        List<RackAsset> rackAssets = rackAssetRepository.listAll();
        if(rackAssets.isEmpty()) {
            Response.status(Response.Status.NOT_FOUND.getStatusCode());
        }
        return rackAssets.stream().map(RackAssetDTO::fromEntity)
                .collect(Collectors.toList());

    }


    @POST
    @Path("/rackId")
    public Response addRackAsset(RackAssetDTO rackAssetDTO, @QueryParam("rackId") UUID rackId) {

        RackAsset rackAsset = new RackAsset();
        rackAsset.assetTag = rackAssetDTO.assetTag;
        rackAsset.createdAt = LocalDate.now();
        rackAsset.modifiedAt = LocalDate.now();
        RackAsset createadRackAsset = rackAssetRepository.addRackAsset(rackAsset, rackId);
        RackAssetDTO resultDTO = RackAssetDTO.fromEntity(createadRackAsset);

        return Response.status(Response.Status.CREATED)
                .entity(resultDTO)
                .build();
    }

    @DELETE
    public Response deleteRackAsset(@QueryParam("rackAssetId") UUID rackAssetId) {
        RackAsset rackAsset = rackAssetRepository.findById(rackAssetId);
        if(rackAsset == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        rackAssetRepository.deleteRackAsset(rackAssetId);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

 */


}
