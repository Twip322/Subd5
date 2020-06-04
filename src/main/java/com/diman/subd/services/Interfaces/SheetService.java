package com.diman.subd.services.Interfaces;

import com.diman.subd.entity.Sheet;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SheetService {
    Sheet addSheet(Sheet sheet);
    void delete(int id);
    Optional<Sheet> getById(int id);
    Sheet editSheet(Sheet sheet);
    List<Sheet> getAll();

}
