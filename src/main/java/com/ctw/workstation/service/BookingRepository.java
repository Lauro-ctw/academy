package com.ctw.workstation.service;

import com.ctw.workstation.entity.Booking;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class BookingRepository implements PanacheRepository<Booking> {

    /*public List<Booking> listAllBookings() {
        return list("booking");
    }*/
/*
    public Booking findBookingById(UUID id) {
        return find("id", id).firstResult();
    }

    @Transactional
    public Booking createBooking(Booking booking) {
        if(booking.id == null) {
            booking.id = UUID.randomUUID();
        }
        booking.requesterId = booking.requesterId;
        booking.rackId = booking.rackId;
        booking.bookFrom = booking.bookFrom;
        booking.bookTo = booking.bookTo;
        booking.createdAt = LocalDate.now();
        booking.modifiedAt = LocalDate.now();
        persistAndFlush(booking);
        return booking;
    }

    @Transactional
    public boolean deleteBooking(UUID id) {
        Booking booking = findBookingById(id);
        if(booking == null) {
            throw new EntityNotFoundException("Booking with id " + id + " not found");
        }
        return delete("id", id) > 0;
    }

    @Transactional
    public Booking updateBooking(UUID id, Booking updatedData) {
        Booking booking = findBookingById(id);
        if(booking == null) {
            throw new EntityNotFoundException("Booking with id " + id + " not found");
        }
        booking.requesterId = updatedData.requesterId;
        booking.rackId = updatedData.rackId;
        booking.bookFrom = updatedData.bookFrom;
        booking.bookTo = updatedData.bookTo;
        booking.modifiedAt = LocalDate.now();
        persistAndFlush(booking);
        return booking;

    }

 */
}
