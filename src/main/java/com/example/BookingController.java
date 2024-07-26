package com.example;
        

import java.util.List;
import io.micronaut.context.annotation.InjectScope;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import lombok.NoArgsConstructor;

import com.example.Entities.Booking;



@Controller("/booking")
public class BookingController {

    @Inject
    protected  BookingRepo bookingRepo;

    public BookingController(BookingRepo bookingRepo) {
        this.bookingRepo = bookingRepo;
    }

    @Get(uri="/", produces="application/json")
    public List<Booking> getBookings() {
        return bookingRepo.findAll();
        
    }


    @Post(uri="/new", produces="application/json")
    public HttpResponse<Booking> newBooking(@Valid @Body Booking booking) {
        
        bookingRepo.save(booking);
        return HttpResponse
            .created(booking);
    }
    @Get(uri="/check", produces="text/plain")
    public String checkAvailability() {
        return null;
    }
   
    
}
