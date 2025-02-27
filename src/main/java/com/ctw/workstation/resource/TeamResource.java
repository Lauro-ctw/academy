package com.ctw.workstation.resource;


import com.ctw.workstation.dto.TeamRequestDTO;
import com.ctw.workstation.entity.Team;
import com.ctw.workstation.service.TeamRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

//@Path("/teams")
//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
public class TeamResource {
/*
    @Inject
    TeamRepository teamRepository;

    @GET
    public List<TeamRequestDTO> getAllTeams() {
        List<Team> teams = teamRepository.listAll();
        return teams.stream().map(TeamRequestDTO::fromEntity)
                .collect(Collectors.toList());
    }

    @POST
    public Response createTeam(TeamRequestDTO teamRequestDTO) {
        Team team = new Team();
        //team.id = UUID.randomUUID();

        team.name = teamRequestDTO.name;
        team.product = teamRequestDTO.product;
        team.defaultLocation = teamRequestDTO.defaultLocation;
        team.createdAt = LocalDate.now();
        team.modifiedAt = LocalDate.now();

        //teamRepository.persist(team);
        Team createdTeam = teamRepository.createTeam(team);
        Response response = Response.status(Response.Status.CREATED).entity(teamRequestDTO).build();
        TeamRequestDTO resultDTO  = TeamRequestDTO.fromEntity(createdTeam);

        return Response.status(Response.Status.CREATED).entity(resultDTO).build();*/
        /*
        return Response.status(Response.Status.CREATED)
                .entity(teamDTO)
                .build();

         */
/*
    }*/

}
