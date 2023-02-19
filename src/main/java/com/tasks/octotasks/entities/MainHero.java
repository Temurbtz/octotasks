package com.tasks.octotasks.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class MainHero {

    @Id
    @SequenceGenerator(
            name = "mainhero_sequence",
            sequenceName = "mainhero_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "mainhero_sequence"
    )
    private Long id;

    private String fullName;

    private  String description;

    @OneToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "novel_id",
            referencedColumnName = "id"
    )
    private Novel novel;
}
