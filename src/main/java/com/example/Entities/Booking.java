package com.example.Entities;


import io.micronaut.serde.annotation.Serdeable;
import com.example.Entities.Guest;
import com.example.Entities.Room;
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
}
