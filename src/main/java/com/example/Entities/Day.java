package com.example.Entities;

import java.sql.Date;

import io.micronaut.data.annotation.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@Table(name = "days")
public class Day {
    @Id
    private Date id;
    
}
