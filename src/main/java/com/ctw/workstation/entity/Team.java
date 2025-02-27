package com.ctw.workstation.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "T_TEAM")
public class Team {

    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teamIdGenerator")
    //@SequenceGenerator(name = "teamIdGenerator", sequenceName = "SEQ_TEAM_ID")
    private UUID id;
    @Column(name = "NAME", nullable = false, length = 20)
    private String name;
    @OneToMany(mappedBy = "teamId", fetch=FetchType.LAZY)
    private List<Rack> racks;
    @Temporal(TemporalType.DATE)
    @Column(name = "created_at")
    private LocalDate createdAt;
    @Temporal(TemporalType.DATE)
    @Column(name = "modified_at")
    private LocalDate modifiedAt;
    @Column(name = "DEFAULT_LOCATION")
    private String defaultLocation;
    @Column(name = "PRODUCT", length = 20)
    private String product;

    /*


    private Team(Long id, String name, LocalDate createdAt, LocalDate modifiedAt, String defaultLocation) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.defaultLocation = defaultLocation;
    }

     */

    public Team() {

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

    public List<Rack> getRacks() {
        return racks;
    }

    public void setRacks(List<Rack> racks) {
        this.racks = racks;
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

    public String getDefaultLocation() {
        return defaultLocation;
    }

    public void setDefaultLocation(String defaultLocation) {
        this.defaultLocation = defaultLocation;
    }



    private static class Builder {
        private Long id;
        private String name;
        private LocalDate createdAt;
        private LocalDate modifiedAt;
        private String defaultLocation;

        public Builder(Long id, String name, LocalDate createdAt, LocalDate modifiedAt, String defaultLocation) {
            this.id = id;
            this.name = name;
            this.createdAt = createdAt;
            this.modifiedAt = modifiedAt;
            this.defaultLocation = defaultLocation;
        }
        public Team build() {
            //return new Team(id, name, createdAt, modifiedAt, defaultLocation);
            return new Team();
        }
    }



}
