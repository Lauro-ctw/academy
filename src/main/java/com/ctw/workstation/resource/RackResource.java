package com.ctw.workstation.resource;

//import com.ctw.workstation.dto.RackDTO;
import com.ctw.workstation.dto.RackRequestDTO;
import com.ctw.workstation.dto.RackResponseDTO;
import com.ctw.workstation.entity.Rack;
import com.ctw.workstation.service.RackRepository;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.logging.Log;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.logging.MDC;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@Path("/racks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RackResource {

    @Inject
    private RackRepository rackRepository;

    @GET
    public Response getAllRacks() {
        List<Rack> racks = rackRepository.findAllRacks();
        List<RackResponseDTO> dtos = racks.stream()
                .map(this::convertToResponseDTO)
                .collect(Collectors.toList());
        return Response.ok(dtos).build();
    }


    @GET
    @Path("/{id}")
    public Response getRackById(@PathParam("id") UUID id) {
        Rack rack = rackRepository.findById(id);
        if (rack == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Rack not found for id: " + id)
                    .build();
        }
        RackResponseDTO dto = convertToResponseDTO(rack);
        return Response.ok(dto).build();
    }

    @POST
    @Transactional
    public Response createRack(RackRequestDTO rackRequest) {
        Rack rack = new Rack();
        if(rack.getId() == null) {
            rack.setId(UUID.randomUUID());
        }

        if(rack.getSerialNumber() == null) {
            //rack.setSerialNumber("r_" + rack.getId());
            rack.setSerialNumber(rackRequest.getSerialNumber());
        }
        rack.setCreatedAt(LocalDate.now());
        rack.setModifiedAt(LocalDate.now());
        rack.setStatus(rackRequest.getStatus());
        rack.setDefaultLocation(rackRequest.getDefaultLocation());
        /*if(rack.getTeamId() == null) {
            rack.setTeamId(UUID.randomUUID());
        }*/
        //rack.setTeamId(rackRequest.getTeamId());

        rackRepository.create(rack);

        RackResponseDTO dto = convertToResponseDTO(rack);
        return Response.status(Response.Status.CREATED)
                .entity(dto)
                .build();
    }

    private RackResponseDTO convertToResponseDTO(Rack rack) {
        RackResponseDTO dto = new RackResponseDTO();
        dto.setId(rack.getId());
        dto.setSerialNumber(rack.getSerialNumber());
        dto.setCreatedAt(rack.getCreatedAt());
        dto.setModifiedAt(rack.getModifiedAt());
        dto.setStatus(rack.getStatus());
        dto.setDefaultLocation(rack.getDefaultLocation());
        //dto.setTeamId(rack.getTeamId());
        return dto;
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response deleteRackById(@PathParam("id") UUID id) {
        Rack rack = rackRepository.findById(id);
        if(rack == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        rackRepository.delete(rack);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response updateRack(@PathParam("id") UUID id, RackRequestDTO rackRequest) {
        Rack existingRack = rackRepository.findById(id);
        if(existingRack == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        existingRack.setSerialNumber(rackRequest.getSerialNumber());
        existingRack.setModifiedAt(LocalDate.now());
        existingRack.setStatus(rackRequest.getStatus());
        existingRack.setDefaultLocation(rackRequest.getDefaultLocation());

        rackRepository.update(String.valueOf(existingRack));
        return Response.status(Response.Status.NO_CONTENT).build();
    }


}
