package com.ctw.workstation.service;

import com.ctw.workstation.entity.Rack;
import com.ctw.workstation.entity.Team;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.core.Response;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class RackRepository implements PanacheRepository<Rack> {

    private EntityManager em;



    public Rack findById(UUID id) {
        return find("id", id).firstResult();
    }

    public List<Rack> findAllRacks() {
        //return find("rack", Rack.class).list();
        return listAll();
    }

    public void create(Rack rack) {
        //persist(rack);
        persistAndFlush(rack);
    }





/*
    public Rack findRackById(UUID id) {
        return find("id", id).firstResult();
    }

    public Rack findRackByName(String name) {
        return find("name", name).firstResult();
    }


    public List<Rack> findAllRacks() {
        return find("rack", Rack.class).list();
    }

    public List<Rack> findAllRacksByTeam(Team team) {
        return find("team", team).list();
    }

    public void save(Rack rack) {
        persistAndFlush(rack);
    }

    @GET
    public Response get_All_racks() {
        return Response.ok(findAllRacks()).build();
    }



    @Transactional
    public Rack createRack(Rack rack) {
        if(rack.id == null) {
            rack.id = UUID.randomUUID();
        }
        if(rack.serialNumber == null) {
            rack.serialNumber = rack.id + "-" + UUID.randomUUID();
        }
        rack.createdAt = LocalDate.now();
        rack.modifiedAt = LocalDate.now();
        persistAndFlush(rack);
        return rack;

    }

    @Transactional
    public boolean deleleteById(UUID id){
        Rack rack = findRackById(id);
        if(rack == null){
            throw new EntityNotFoundException("Rack not found");
        }
        return delete("id", id) > 0;
    }

    @Transactional
    public Rack updateRack(UUID id, Rack updatedRack) {
        //update(findRackById(rack.getId()));
        Rack rack = findRackById(id);
        if(rack == null){
            throw new EntityNotFoundException("Rack not found");
        }
        rack.modifiedAt = LocalDate.now();
        rack.defaultLocation = updatedRack.defaultLocation;
        rack.status = updatedRack.status;
        rack.age = updatedRack.age;
        rack.teamId = updatedRack.teamId;
        return rack;
    }
    */

}
