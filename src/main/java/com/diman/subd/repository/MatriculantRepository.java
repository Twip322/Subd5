package com.diman.subd.repository;

import com.diman.subd.entity.Matriculant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculantRepository extends JpaRepository<Matriculant,Integer> {
}
