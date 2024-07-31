package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "room_occupancy")
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor   

public class RoomOccupancy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long Id;

    @Column(name = "guest_id")
    private long room_id;

    @Column(name = "days_id")
    private Date days_id;

   
    
}
