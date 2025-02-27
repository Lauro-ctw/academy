package com.ctw.workstation.entity;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import com.ctw.workstation.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

import java.time.LocalDate;
import java.util.UUID;


@Entity
@Table(name = "T_RACK")
public class Rack {
    private static final String GET_ALL = "Rack.getAll";
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rackIdGenerator")
    //@SequenceGenerator(name = "rackIdGenerator", sequenceName = "SEQ_RACK_ID")
    private UUID id;
    @Column(name="SERIAL_NUMBER")
    private String serialNumber;
    @Transient
    private int age;
    @Temporal(TemporalType.DATE)
    @Column(name = "created_at")
    private LocalDate createdAt;
    @Temporal(TemporalType.DATE)
    @Column(name = "modified_at")
    private LocalDate modifiedAt;
    @Column(name="STATUS")
    private Status status;
    @Column(name="DEFAULT_LOCATION")
    private String defaultLocation;
    @Column(name="TEAM_ID")
    private UUID teamId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="TEAM_ID", updatable = false, insertable = false, nullable = true)
    private Team team;


    public Rack() {

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDefaultLocation() {
        return defaultLocation;
    }

    public void setDefaultLocation(String defaultLocation) {
        this.defaultLocation = defaultLocation;
    }

    public UUID getTeamId() {
        return teamId;
    }

    public void setTeamId(UUID teamId) {
        this.teamId = teamId;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Rack{" +
                "id=" + id +
                ", serialNumber='" + serialNumber + '\'' +
                ", age=" + age +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                ", status=" + status +
                ", defaultLocation='" + defaultLocation + '\'' +
                ", teamId=" + teamId +
                ", team=" + team +
                '}';
    }


    private static class Builder{
        private UUID id;
        private String serialNumber;
        private int age;
        private LocalDate createdAt;
        private LocalDate modifiedAt;
        private Status status;
        private String defaultLocation;
        private Long teamId;

        private Builder(UUID id, String serialNumber, int age, LocalDate createdAt, LocalDate modifiedAt, Status status, String defaultLocation, Long teamId)
        {
            this.id = id;
            this.serialNumber = serialNumber;
            this.age = age;
            this.createdAt = createdAt;
            this.modifiedAt = modifiedAt;
            this.status = status;
            this.defaultLocation = defaultLocation;
            this.teamId = teamId;
        }

        public Rack build(){
            return new Rack();
        }

    }





}
