package com.example;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

import com.example.Entities.*;

@Repository
public interface RoomRepo extends JpaRepository<Room, Long>
    {

    
} 
