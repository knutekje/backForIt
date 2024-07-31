package com.example;

import java.util.List;

import com.example.Entities.Room;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import lombok.NoArgsConstructor;

@Controller("/room")
@NoArgsConstructor
public class RoomController {
    
    @Inject
    protected RoomRepo roomRepo;

   /*  public RoomController(RoomRepo roomRepo) {
        this.roomRepo = roomRepo;
    } */
    @Get(uri="/", produces="application/json")
    public List<Room> getRooms(){
        return roomRepo.findAll();
    }
}
