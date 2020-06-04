package com.diman.subd.services.Interfaces;

import com.diman.subd.entity.Examiner;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ExaminerService {
    Examiner addExaminer(Examiner examiner);
    void delete(int id);
    Optional<Examiner> getById(int id);
    Examiner editExaminer(Examiner examiner);
    List<Examiner> getAll();
}
