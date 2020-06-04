package com.diman.subd.services.Interfaces;

import com.diman.subd.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CourseService {
    Course addCourse(Course course);
    void delete(int id);
    Optional<Course> getById(int id);
    Course editCourse(Course course);
    List<Course> getAll();
}
