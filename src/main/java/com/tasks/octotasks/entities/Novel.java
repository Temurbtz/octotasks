package com.tasks.octotasks.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Entity
@Data
public class Novel {

    @Id
    @SequenceGenerator(
            name = "novel_sequence",
            sequenceName = "novel_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "novel_sequence"
    )
    private Long id;

    private String title;

    private Date  dateWritten;

    private Long countOfWords;

    private String writtenLanguage;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "novel_publisher",
            joinColumns = @JoinColumn(
                    name = "novel_id",
                    referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "publisher_id",
                    referencedColumnName = "id"
            )
    )
    private List<Publisher> publishers;
}
