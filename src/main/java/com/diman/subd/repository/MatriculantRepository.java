package com.diman.subd.repository;

import com.diman.subd.entity.Matriculant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculantRepository extends JpaRepository<Matriculant, Integer> {

    @Query("SELECT new com.diman.subd.repository.GetNameMatriculant" +
            "(m.name,m.surname) FROM Matriculant m")
    List<GetNameMatriculant> getNameMatriculants();
}
