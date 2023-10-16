package com.example.testrest2dbh2.controller;


import com.example.testrest2dbh2.entity.Student;
import com.example.testrest2dbh2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class Controller {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> showAllStudents() { return studentService.getAllStudents(); }
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable("id") int id) { return studentService.getStudent(id); }
	
	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student student) { return studentService.saveStudent(student); }
	
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
		return student;
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable("id") int id) { studentService.deleteStudent(id); }
}
