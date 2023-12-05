package com.example.crrichard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crrichard.model.Curriculo;

public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
    
}