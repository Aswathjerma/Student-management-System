package com.example.SMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SMS.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
