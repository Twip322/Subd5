package com.diman.subd.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Examiner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String surname;
    private String middle_name;
    private String graduation;

    @OneToMany
    private List<Examination> examinations;
    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname" + surname + '\'' +
                ", middle_name" + middle_name + '\'' +
                ", graduation" + graduation +
                '}';
    }

    public Examiner() {

    }

    public Examiner(Integer id,
                    String name,
                    String surname,
                    String middle_name,
                    String graduation,
                    List<Examination> examinations
                    ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middle_name = middle_name;
        this.graduation = graduation;
        this.examinations=examinations;
    }
}
