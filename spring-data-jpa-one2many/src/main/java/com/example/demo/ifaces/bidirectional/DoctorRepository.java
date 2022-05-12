package com.example.demo.ifaces.bidirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.bidirectional.Doctor;

@Repository(value = "bd")
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}


