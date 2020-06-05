package com.diman.subd.services.implementation;

import com.diman.subd.entity.Examiner;
import com.diman.subd.model.OffsetablePageRequest;
import com.diman.subd.repository.ExaminerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.diman.subd.services.Interfaces.ExaminerService;

import java.util.List;
import java.util.Optional;

@Service
public class ExaminerImplement implements ExaminerService {
    @Autowired
    private ExaminerRepository examinerRepository;
    @Override
    public Examiner addExaminer(Examiner examiner)
    {
        Examiner savedExaminer=examinerRepository.saveAndFlush(examiner);
        return savedExaminer;
    }
   @Override
    public void delete(int id)
   {
       examinerRepository.deleteById(id);
   }
   @Override
    public Optional<Examiner> getById(int id)
   {
       return examinerRepository.findById(id);
   }
   @Override
    public Examiner editExaminer(Examiner examiner)
   {
       return examinerRepository.saveAndFlush(examiner);
   }
   @Override
    public List<Examiner> getAll()
   {
       return examinerRepository.findAll();
   }
   @Override
    public List<Examiner> getAll(int offset,int count)
   {
       return examinerRepository.findAll(new OffsetablePageRequest(offset,count)).toList();
   }
}
