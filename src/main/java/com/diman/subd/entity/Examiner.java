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
        return "Examiner {" +'\n'+
                "id=" + id + ", \n"+
                "name=" + name + ", \n" +
                "surname=" + surname + ", \n" +
                "middle_name=" + middle_name + ", \n" +
                "graduation=" + graduation + '\n'+
                '}'+ '\n';
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
        this.examinations = examinations;
    }
}
