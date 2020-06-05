package com.diman.subd.services.implementation;

import com.diman.subd.entity.Classroom;
import com.diman.subd.repository.ClassroomRepository;
import com.diman.subd.model.OffsetablePageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.diman.subd.services.Interfaces.ClassroomService;

import java.util.List;
import java.util.Optional;

@Service
public class ClassroomImplement implements ClassroomService {
    @Autowired
    private ClassroomRepository classroomRepository;
    @Override
    public Classroom addClassroom(Classroom classroom)
    {
        Classroom savedClassroom=classroomRepository.saveAndFlush(classroom);
        return savedClassroom;
    }

   @Override
    public void delete(int id)
   {
       classroomRepository.deleteById(id);
   }
   @Override
    public Optional<Classroom> getById(int id)
   {
       return classroomRepository.findById(id);
   }
    @Override
    public Classroom editClassroom(Classroom classroom)
    {
        return classroomRepository.saveAndFlush(classroom);
    }
    @Override
    public List<Classroom> getAll()
    {
        return classroomRepository.findAll();
    }
    @Override
    public List<Classroom> getAll(int offset,int count){
        return classroomRepository.findAll(new OffsetablePageRequest(offset,count)).toList();
    }
}
