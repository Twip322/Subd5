package com.diman.subd.services.Interfaces;

import com.diman.subd.entity.Examination;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ExaminationService {
    Examination addExamination(Examination examination);
    void delete(int id);
    Optional<Examination> getById(int id);
    Examination editExamination(Examination examination);
    List<Examination> getAll();
}
