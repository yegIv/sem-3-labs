package com.example.testrest2dbh2.service;


import com.example.testrest2dbh2.dao.StudentDAO;
import com.example.testrest2dbh2.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	@Transactional
	public List<Student> getAllStudents() { return studentDAO.getAllStudents(); }
	
	@Override
	@Transactional
	public Student getStudent(int id) { return studentDAO.getStudent(id); }
	
	
	@Override
	@Transactional
	public Student saveStudent(Student student) { return studentDAO.saveStudent(student); }
	
	@Override
	@Transactional
	public void deleteStudent(int id) { studentDAO.deleteStudent(id); }
}
