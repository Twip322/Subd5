package com.diman.subd.repository;

import com.diman.subd.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
  /*  @Query("SELECT new com.diman.subd.repository.CourseNameWithCount(courseName, COUNT (a)) FROM Course a"+
    " GROUP BY courseName")
     List<CourseNameWithCount> getNameCourseCount();
    */
}
