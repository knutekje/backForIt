package com.example;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;
import io.micronaut.data.repository.CrudRepository;
import com.example.Entities.Booking;


public interface BookingRepo extends JpaRepository<Booking, Long> {

}
