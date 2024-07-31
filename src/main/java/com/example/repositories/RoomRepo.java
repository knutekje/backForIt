package com.example.repositories;
import com.example.entities.*;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface RoomRepo extends JpaRepository<Room, Long>
    {

    
} 
