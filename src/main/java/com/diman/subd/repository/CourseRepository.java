package com.diman.subd.repository;

import com.diman.subd.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    @Query("SELECT new com.diman.subd.repository.CourseNameWithCount "+
            "(c.courseName,COUNT (c.courseName)) FROM Course c"+
            " GROUP BY c.courseName ")
        List<CourseNameWithCount> getNameWithCount();
}
