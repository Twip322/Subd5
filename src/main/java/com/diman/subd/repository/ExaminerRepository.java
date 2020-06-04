package com.diman.subd.repository;

import com.diman.subd.entity.Examiner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExaminerRepository extends JpaRepository<Examiner,Integer> {
}
