package com.ctw.workstation.service;

import com.ctw.workstation.entity.Team;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.core.Response;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;


@ApplicationScoped
public class TeamRepository implements PanacheRepository<Team> {

    // find team by name
    public List<Team> findByName(String name) {
        return find("name", name).firstResult();
        //return list("name", name);
    }

    // find team by id
    public Team findById(UUID id) {
        return find("id", id).firstResult();
    }

    // find team by product type
    public List<Team> findByProduct(String product) {
        return list("product", product);
    }
/*
    // update team database on id
    @Transactional
    public Team updateTeam(UUID id, Team updateData){
        Team team = findById(id);
        if (team == null) {
            throw new EntityNotFoundException("Team not found");
        }
        team.name = updateData.name;
        team.defaultLocation = updateData.defaultLocation;
        team.modifiedAt = updateData.modifiedAt;
        return team;



    }*/

    /*

    @GET
    public Response getAllTeams() {
        return Response.ok(getAllTeams()).build();
    }

    @Transactional
    public boolean deleteTeam(UUID id) {
        Team team = findById(id);
        if (team == null) {
            throw new EntityNotFoundException("Team not found");
        }
        return delete("id", id) > 0;
    }*/


    //@POST
/*
    @Transactional
    public Team createTeam(Team team) {

        if(team.id == null) {
            team.id = UUID.randomUUID();
        }

        team.createdAt = LocalDate.now();
        team.modifiedAt = LocalDate.now();
        persistAndFlush(team);
        return team;

    }

 */

   /* @Transactional
    public TeamDTO createTeam() {
        TeamDTO dto = new TeamDTO();

        Team team = new Team();
        team.name = dto.name;

        if(team.id == null) {
            team.id = UUID.randomUUID();
        }

        team.createdAt = LocalDate.now();
        team.modifiedAt = LocalDate.now();
        persistAndFlush(team);
        return dto;

    }*/




    /*@POST
    @Transactional
    public Response createTeam(Team team) {
        if(team.id == null) {
            team.id = UUID.randomUUID();
        }
        team.modifiedAt = LocalDate.now();
        persistAndFlush(team);
        return Response.ok(team).build();
    }*/

}
