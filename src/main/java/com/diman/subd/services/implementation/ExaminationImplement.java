package com.diman.subd.services.implementation;

import com.diman.subd.entity.Examination;
import com.diman.subd.model.OffsetablePageRequest;
import com.diman.subd.repository.ExaminationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.diman.subd.services.Interfaces.ExaminationService;

import java.util.List;
import java.util.Optional;

@Service
public class ExaminationImplement implements ExaminationService {
    @Autowired
    private ExaminationRepository examinationRepository;

    @Override
    public Examination addExamination(Examination examination)
    {
        Examination savedExmination=examinationRepository.saveAndFlush(examination);
        return savedExmination;
    }
    @Override
    public void delete(int id)
    {
        examinationRepository.deleteById(id);
    }
    @Override
    public Optional<Examination> getById(int id)
    {
        return examinationRepository.findById(id);
    }
    @Override
    public Examination editExamination(Examination examination)
    {
        return examinationRepository.saveAndFlush(examination);
    }
    @Override
    public List<Examination> getAll()
    {
        return examinationRepository.findAll();
    }
    @Override
    public List<Examination> getAll(int offset,int count)
    {
        return examinationRepository.findAll(new OffsetablePageRequest(offset,count)).toList();
    }
}
