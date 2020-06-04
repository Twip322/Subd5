package com.diman.subd.repository;

public class CourseNameWithCount {
    private String courseName;
    private Long count;
    public CourseNameWithCount(String courseName,
                               Long count) {
        this.courseName = courseName;
        this.count = count;
    }

    public CourseNameWithCount() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
