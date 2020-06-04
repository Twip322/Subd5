package com.diman.subd.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Sheet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer rating;

    @ManyToOne
    private Matriculant matriculant;

    @ManyToOne
    private Examination examination;

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", rating" + rating +
                '}';
    }

    public Sheet() {

    }

    public Sheet(Integer id,
                 Integer rating,
                 Matriculant matriculants,
                 Examination examinations
    ) {
        this.id = id;
        this.rating = rating;
        this.matriculant = matriculants;
        this.examination = examinations;
    }
}
