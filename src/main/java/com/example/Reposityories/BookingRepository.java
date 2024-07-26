package com.example.Reposityories;

import io.micronaut.data.jpa.repository.JpaRepository;

import com.example.Entities.Booking;


public interface BookingRepository extends JpaRepository<Booking, Long> {

}
