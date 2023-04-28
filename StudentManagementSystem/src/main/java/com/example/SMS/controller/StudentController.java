package com.example.SMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.SMS.Entity.Student;
import com.example.SMS.Service.StudentService;

@Controller
public class StudentController {
	
	private StudentService StudentService;

	public StudentController(com.example.SMS.Service.StudentService studentService) {
		super();
		StudentService = studentService;
	}
	
@GetMapping("/students")
public String listStudents(Model model) {
	model.addAttribute("students", StudentService.getAllStudents());
	return "students";
}
}
