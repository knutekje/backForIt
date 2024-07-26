package com.example.Controllers;

import java.util.List;

import com.example.BookingRepo;
import com.example.Entities.Booking;



import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import lombok.NoArgsConstructor;

@Controller("/booking")
@NoArgsConstructor
public class BookingController {
    
  

   

    private BookingRepo bookingRepository;





    @Get(uri="/", produces="application/json")
    public List<Booking> getBookings() {
        return bookingRepository.findAll();
        
    }


    @Post(uri="/new", produces="text/plain")
    public HttpResponse<Booking> newBooking() {
        return null;
    }
    @Get(uri="/check", produces="text/plain")
    public HttpResponse checkAvailability() {
        return null;
    }
    
}
