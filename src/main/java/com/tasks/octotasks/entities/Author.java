package com.tasks.octotasks.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Author {
    @Id
    @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "author_sequence"
    )
    private Long id;

    private String firstName;

    private String lastName;

    private Date dateOfBirth;

    private Date dateOfDeath;

    private Integer workCount;

    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "author_id",
            referencedColumnName = "id"
    )
    private List<Novel> novels;
}
