package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Seminar;

public interface SeminarRepositary extends JpaRepository<Seminar, Integer> {

}
