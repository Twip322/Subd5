package com.diman.subd.services.Interfaces;

import com.diman.subd.entity.Classroom;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ClassroomService {
    Classroom addClassroom(Classroom classroom);
    void delete(int id);
    Optional<Classroom> getById(int id);
    Classroom editClassroom(Classroom classroom);
    List<Classroom> getAll();
}
