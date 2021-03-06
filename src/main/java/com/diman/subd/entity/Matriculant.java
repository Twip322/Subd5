package com.diman.subd.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Matriculant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String middle_name;
    private String surname;
    private String statement_name;

    @OneToMany
    private List<Course> courses;

    @OneToMany
    private List<Sheet> sheets;

    @Override
    public String toString() {
        return "Matriculant {" +'\n'+
                "id=" + id + ", \n"+
                "name='" + name + ", \n" +
                "middle_name=" + middle_name + ", \n" +
                "surname=" + surname + ", \n" +
                "statement_name=" + statement_name + '\n'+
                '}'+ '\n';
    }

    public Matriculant() {

    }

    public Matriculant(Integer id,
                       String name,
                       String middle_name,
                       String surname,
                       String statement_name,
                       List<Course> courses,
                       List<Sheet> sheets
    ) {
        this.id = id;
        this.name = name;
        this.middle_name = middle_name;
        this.surname = surname;
        this.statement_name = statement_name;
        this.courses = courses;
        this.sheets = sheets;
    }
}
