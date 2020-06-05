package com.diman.subd.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Examination {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String examName;

    @ManyToOne
    private Classroom classroom;

    @ManyToOne
    private Course course;

    @ManyToOne
    private Examiner examiner;

    @OneToMany
    private List<Sheet> sheets;

    @Override
    public String toString() {
        return "Examination {" +'\n'+
                "id=" + id + ", \n"+
                "exam_name=" + examName + '\n' +
                '}'+ '\n';
    }

    public Examination() {

    }

    public Examination(Integer id,
                       String examName,
                       Classroom classrooms,
                       Course courses,
                       Examiner examiners,
                       List<Sheet> sheets
    ) {
        this.id = id;
        this.examName = examName;
        this.classroom = classrooms;
        this.course = courses;
        this.examiner = examiners;
        this.sheets = sheets;
    }
}
