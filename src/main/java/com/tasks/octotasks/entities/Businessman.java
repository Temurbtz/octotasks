package com.tasks.octotasks.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Businessman {
    @Id
    @SequenceGenerator(
            name = "businessman_sequence",
            sequenceName = "businessman_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "businessman_sequence"
    )
    private Long id;

    private String fullName;

    private  String address;

    private String city;

    private Double wealth;
}
