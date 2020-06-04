package com.diman.subd.repository;

import com.diman.subd.entity.Sheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SheetRepository extends JpaRepository<Sheet, Integer> {

   @Query("SELECT new com.diman.subd.repository.CountSheetThroughExam(e.examName,COUNT(s.rating))"+
           " FROM Sheet s JOIN Examination e on e.id=s.examination.id"+
           " WHERE s.rating=5 "+
           " GROUP BY e.examName ")
        List<CountSheetThroughExam> getSheetThroughExam();

}
