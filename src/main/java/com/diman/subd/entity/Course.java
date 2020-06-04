package com.diman.subd.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String courseName;

    @ManyToOne
    private Matriculant matriculant;

    @Override
    public String toString() {
        return "Build{" +
                "id=" + id +
                ", course_name='" + courseName + '\'' +
                '}';
    }

    public Course() {

    }

    public Course(Integer id,
                  String courseName,
                  Matriculant matriculants
    ) {
        this.id = id;
        this.courseName = courseName;
        this.matriculant = matriculants;
    }

}
