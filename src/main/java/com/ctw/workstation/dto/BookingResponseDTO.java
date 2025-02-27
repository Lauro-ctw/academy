package com.ctw.workstation.dto;

import java.time.LocalDate;
import java.util.UUID;

public class BookingResponseDTO {
    private UUID id;
    private UUID requesterId;
    private UUID rackId;
    private LocalDate createdAt;
    private LocalDate modifiedAt;
    private LocalDate bookFrom;
    private LocalDate bookrTo;

    public BookingResponseDTO() {}

    public BookingResponseDTO (UUID requesterId, UUID rackID, LocalDate createdAt, LocalDate modifiedAt, LocalDate bookFrom, LocalDate bookrTo) {
        this.id = UUID.randomUUID();
        this.requesterId = requesterId;
        this.rackId = rackID;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.bookFrom = bookFrom;
        this.bookrTo = bookrTo;
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getRequesterId() {
        return requesterId;
    }

    public void setRequesterId(UUID requesterId) {
        this.requesterId = requesterId;
    }

    public UUID getRackId() {
        return rackId;
    }

    public void setRackId(UUID rackId) {
        this.rackId = rackId;
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

    public LocalDate getBookrTo() {
        return bookrTo;
    }

    public void setBookrTo(LocalDate bookrTo) {
        this.bookrTo = bookrTo;
    }
}

