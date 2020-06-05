package com.diman.subd.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer classroom_num;
    private Integer building;

    @OneToMany
    private Set<Examination> examinations;

    @Override
    public String toString() {
        return "Classroom {" +'\n'+
                "id=" + id + ", \n"+
                "classroom_num=" + classroom_num + ", \n" +
                "building=" + building + '\n' +
                '}'+ '\n';
    }

    public Classroom() {

    }

    public Classroom(Integer id,
                     Integer classroom_num,
                     Integer building) {
        this.id = id;
        this.classroom_num = classroom_num;
        this.building = building;
    }
}


