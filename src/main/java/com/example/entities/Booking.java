package com.example.entities;


import java.util.Set;

import com.example.entities.*;

import io.micronaut.data.annotation.Relation;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Serdeable.Serializable
@Serdeable.Deserializable
@Table(name = "bookings")
public class Booking {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    
    @Column(name = "guest_id")
    private long guestId;
   
    @Column(name = "room_id")
    private long roomId;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;

    @JoinColumn(name = "room_id")
    @Relation(value = Relation.Kind.ONE_TO_MANY, cascade = Relation.Cascade.ALL)
    private Set<Room> rooms;
/* 
    @JoinColumn(name = "guest_id")
    @Relation(value = Relation.Kind.MANY_TO_ONE, cascade = Relation.Cascade.ALL)
    private Set<Guest> guests; */
}