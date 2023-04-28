package com.example.SMS.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SMS.Entity.Student;
import com.example.SMS.Service.StudentService;
import com.example.SMS.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository StudetnRepository;
	

	public StudentServiceImpl(StudentRepository studetnRepository) {
		super();
		StudetnRepository = studetnRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		return StudetnRepository.findAll();
	}
	

}
