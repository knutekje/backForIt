package com.example.Controllers;

import com.github.dockerjava.zerodep.shaded.org.apache.hc.core5.http.HttpResponse;

import io.micronaut.http.annotation.Controller;
import lombok.NoArgsConstructor;

@Controller("/booking")
@NoArgsConstructor
public class BookingController {
    
    public HttpResponse newBooking() {
        return null;
    }
    public HttpResponse checkAvailability() {
        return null;
    }
    
}
