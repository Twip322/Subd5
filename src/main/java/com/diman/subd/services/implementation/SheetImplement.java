package com.diman.subd.services.implementation;

import com.diman.subd.entity.Sheet;
import com.diman.subd.model.OffsetablePageRequest;
import com.diman.subd.repository.SheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.diman.subd.services.Interfaces.SheetService;

import java.util.List;
import java.util.Optional;

@Service
public class SheetImplement implements SheetService {
    @Autowired
    private SheetRepository sheetRepository;
    @Override
    public Sheet addSheet(Sheet sheet)
    {
        Sheet savedSheet=sheetRepository.saveAndFlush(sheet);
        return savedSheet;
    }
    @Override
    public void delete(int id) {
        sheetRepository.deleteById(id);
    }
    @Override
    public Optional<Sheet> getById(int id)
    {
       return sheetRepository.findById(id);
    }
    @Override
    public Sheet editSheet(Sheet sheet)
    {
        return sheetRepository.saveAndFlush(sheet);
    }
    @Override
    public List<Sheet> getAll()
    {
        return sheetRepository.findAll();
    }
    @Override
    public List<Sheet> getAll(int offset,int count)
    {
        return sheetRepository.findAll(new OffsetablePageRequest(offset,count)).toList();
    }
}
