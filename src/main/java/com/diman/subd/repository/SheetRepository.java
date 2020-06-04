package com.diman.subd.repository;

import com.diman.subd.entity.Sheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SheetRepository extends JpaRepository<Sheet,Integer> {

   /*@Query("SELECT new com.diman.subd.repository.ExamNameWithCount(count (sheet.rating),examination.examName) FROM Sheet s " +
            "JOIN Examination examination ON s.examinationId "+
            "WHERE s.rating=5 "+
            "GROUP BY examination.examName ")
    List<ExamNameWithCount> getExamName();*/
}
