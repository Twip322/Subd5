package com.diman.subd.services.Interfaces;

import com.diman.subd.entity.Matriculant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MatriculantService {
    Matriculant addMatriculant(Matriculant matriculant);
    void delete(int id);
    Optional<Matriculant> getById(int id);
    Matriculant editMatriculant(Matriculant matriculant);
    List<Matriculant> getAll();
    List<Matriculant> getAll(int offset,int count);
}
