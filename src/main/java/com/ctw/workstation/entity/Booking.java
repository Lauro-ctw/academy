package com.ctw.workstation.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "T_BOOKING")
public class Booking {

    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookingIdGenerator")
    //@SequenceGenerator(name = "bookingIdGenerator", sequenceName = "SEQ_BOOKING_ID")
    private UUID id;
    @Column(name="REQUESTER_ID", nullable = false)
    private UUID requesterId;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REQUESTER_ID", updatable = false, insertable = false)
    private Team requester;
    @Column(name = "RACK_ID", nullable = false)
    private UUID rackId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RACK_ID", nullable = false, updatable = false, insertable = false)
    private Rack rack;
    @Temporal(TemporalType.DATE)
    @Column(name = "created_at")
    private LocalDate createdAt;
    @Temporal(TemporalType.DATE)
    @Column(name = "modified_at")
    private LocalDate modifiedAt;
    @Temporal(TemporalType.DATE)
    @Column(name = "book_from")
    private LocalDate bookFrom;
    @Temporal(TemporalType.DATE)
    @Column(name = "book_to")
    private LocalDate bookTo;

    /*

    private Booking(Long requesterId, Long rackId, LocalDate createdAt, LocalDate modifiedAt, LocalDate bookFrom, LocalDate bookTo) {
        this.requesterId = requesterId;
        this.rackId = rackId;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.bookFrom = bookFrom;
        this.bookTo = bookTo;
    }

     */

    public Booking() {

    }

    public UUID getRequesterId() {
        return requesterId;
    }

    public void setRequesterId(UUID requesterId) {
        this.requesterId = requesterId;
    }

    public Team getRequester() {
        return requester;
    }

    public void setRequester(Team requester) {
        this.requester = requester;
    }

    public UUID getRackId() {
        return rackId;
    }

    public void setRackId(UUID rackId) {
        this.rackId = rackId;
    }

    public Rack getRack() {
        return rack;
    }

    public void setRack(Rack rack) {
        this.rack = rack;
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

    public LocalDate getBookFrom() {
        return bookFrom;
    }

    public void setBookFrom(LocalDate bookFrom) {
        this.bookFrom = bookFrom;
    }

    public LocalDate getBookTo() {
        return bookTo;
    }

    public void setBookTo(LocalDate bookTo) {
        this.bookTo = bookTo;
    }


    public static class Builder {
        private Long requesterId;
        private Long rackId;
        private LocalDate createdAt;
        private LocalDate modifiedAt;
        private LocalDate bookFrom;
        private LocalDate bookTo;

        public Builder(Long requesterId, Long rackId, LocalDate createdAt, LocalDate modifiedAt, LocalDate bookFrom, LocalDate bookTo) {
            this.requesterId = requesterId;
            this.rackId = rackId;
            this.createdAt = createdAt;
            this.modifiedAt = modifiedAt;
            this.bookFrom = bookFrom;
            this.bookTo = bookTo;

        }
        public Booking build() {
            //return new Booking(requesterId, rackId, createdAt, modifiedAt, bookFrom, bookTo);
            return new Booking();
        }
    }

}
