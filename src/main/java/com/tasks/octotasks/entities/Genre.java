package com.tasks.octotasks.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Genre {

    @Id
    @SequenceGenerator(
            name = "genre_sequence",
            sequenceName = "genre_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "genre_sequence"
    )
    private Long id;

    private String title;

    private String description;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "genre_id",
            referencedColumnName = "id"
    )
    private List<Novel> novels;
}
