package com.ctw.workstation.entity;

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


@Entity
@Table(name = "T_TEAM_MEMBER")
public class TeamMember {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teamMemberIdGenerator")
    @SequenceGenerator(name = "teamMemberIdGenerator", sequenceName = "SEQ_TEAM_MEMBER_ID")
    public Long id;
    @Column(name = "CTW_ID", nullable = false)
    public Long ctwId;
    @Column(name = "NAME", nullable = false)
    public String name;
    @Temporal(TemporalType.DATE)
    public LocalDate createdAt;
    @Temporal(TemporalType.DATE)
    public LocalDate modifiedAt;
    @Column(name = "TEAM_ID")
    public Long teamId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID", updatable = false, insertable = false)
    public Team team;

    /*

    public TeamMember(Long ctwId, String name, LocalDate createdAt, LocalDate modifiedAt, Long teamId) {
        this.ctwId = ctwId;
        this.name = name;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.teamId = teamId;

    }

     */

    public TeamMember() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCtwId() {
        return ctwId;
    }

    public void setCtwId(Long ctwId) {
        this.ctwId = ctwId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    /*

    public static class Builder {
        private Long ctwId;
        private String name;
        private LocalDate createdAt;
        private LocalDate modifiedAt;
        private Long teamId;
        private Team team;

        public Builder(Long ctwId, String name, LocalDate createdAt, LocalDate modifiedAt, Long teamId) {
            this.ctwId = ctwId;
            this.name = name;
            this.createdAt = createdAt;
            this.modifiedAt = modifiedAt;
            this.teamId = teamId;
        }
        public TeamMember build() {
            return new TeamMember(ctwId, name, createdAt, modifiedAt, teamId);
        }
    }

     */
}
