package com.diman.subd.services.implementation;

import com.diman.subd.entity.Matriculant;
import com.diman.subd.repository.MatriculantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.diman.subd.services.Interfaces.MatriculantService;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculantImplement  implements MatriculantService {
    @Autowired
    private MatriculantRepository matriculantRepository;
    @Override
    public Matriculant addMatriculant(Matriculant matriculant)
    {
        Matriculant savedMatriculant=matriculantRepository.saveAndFlush(matriculant);
        return savedMatriculant;
    }
    @Override
    public void delete(int id) {
        matriculantRepository.deleteById(id);
    }
    @Override
    public Optional<Matriculant> getById(int id)
    {
        return matriculantRepository.findById(id);
    }
    @Override
    public Matriculant editMatriculant(Matriculant matriculant)
    {
       return matriculantRepository.saveAndFlush(matriculant);
    }
    @Override
    public List<Matriculant> getAll()
    {
        return matriculantRepository.findAll();
    }
}
