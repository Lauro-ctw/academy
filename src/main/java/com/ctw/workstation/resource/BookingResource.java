package com.ctw.workstation.resource;


import com.ctw.workstation.dto.BookingRequestDTO;
import com.ctw.workstation.entity.Booking;
import com.ctw.workstation.service.BookingRepository;
import io.quarkus.logging.Log;
import jakarta.inject.Inject;
import jakarta.persistence.EntityNotFoundException;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

//@Path("/bookings")
//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
public class BookingResource {

/*

    @Inject
    BookingRepository bookingRepository;

    @GET
    public List<BookingRequestDTO> getBookings() {
        Log.info("get All Bookings");

        List<Booking> bookings = bookingRepository.listAll();
        return bookings.stream().map(BookingRequestDTO::fromEntity)
                .collect(Collectors.toList());
    }

    @GET
    @Path("/bookingId")
    public Booking getBookingById(@QueryParam("bookingId") UUID bookingId){
        Booking booking = bookingRepository.findBookingById(bookingId);
        if(booking == null){
            throw new EntityNotFoundException("Booking with id " + bookingId + " not found");
        }
        return booking;
    }

    @POST
    @Path("/bookTo")
    public Response addBooking(BookingRequestDTO bookingRequestDTO, @QueryParam("bookTo")LocalDate bookTo) {
        Booking booking = new Booking();

        booking.requesterId = bookingRequestDTO.requesterId;
        booking.rackId = bookingRequestDTO.rackId;
        booking.bookFrom = bookingRequestDTO.bookFrom;
        booking.bookTo = bookTo;

        Booking createdBooking = bookingRepository.createBooking(booking);
        return Response.status(Response.Status.CREATED)
                .entity(createdBooking)
                .build();
    }

    @DELETE
    @Path(("/bookingId"))
    public Response deleteBookingByID(@QueryParam("bookingId") UUID bookingId) {
        Booking booking = getBookingById(bookingId);
        if(booking == null){
            Log.error("Booking with id " + bookingId + " not found");
            throw new EntityNotFoundException("Booking with id " + bookingId + " not found");

        }
        bookingRepository.deleteBooking(bookingId);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

 */

}
