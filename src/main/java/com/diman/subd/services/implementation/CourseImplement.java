package com.diman.subd.services.implementation;

import com.diman.subd.entity.Course;
import com.diman.subd.repository.CourseRepository;
import com.diman.subd.services.Interfaces.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseImplement implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course addCourse(Course course)
    {
        Course savedCourse=courseRepository.saveAndFlush(course);
        return savedCourse;
    }

    @Override
    public void delete(int id)
    {
        courseRepository.deleteById(id);
    }
    @Override
    public Optional<Course> getById(int id)
    {
        return courseRepository.findById(id);
    }
    @Override
    public Course editCourse(Course course)
    {
        return courseRepository.saveAndFlush(course);
    }
    @Override
    public List<Course> getAll()
    {
        return courseRepository.findAll();
    }
}
