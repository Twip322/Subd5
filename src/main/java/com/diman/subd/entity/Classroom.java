package com.diman.subd.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer classroomNum;
    private Integer building;

    @OneToMany
    private Set<Examination> examinations;

    @Override
    public String toString() {
        return "Classroom {" +'\n'+
                "id=" + id + ", \n"+
                "classroom_num=" + classroomNum + ", \n" +
                "building=" + building + '\n' +
                '}'+ '\n';
    }

    public Classroom() {

    }

    public Classroom(Integer id,
                     Integer classroomNum,
                     Integer building) {
        this.id = id;
        this.classroomNum = classroomNum;
        this.building = building;
    }
}


