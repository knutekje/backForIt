package com.example.Entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@Table(name = "days")
public class Day {
    
    @Id
    @Column(name = "id")
    private Date id;
    
    
}
