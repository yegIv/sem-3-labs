package com.example.testrest2dbh2.dao;


import com.example.testrest2dbh2.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentDAO {
	List<Student> getAllStudents();
	
	Student getStudent(int id);
	
	Student saveStudent(Student student);
	
	void deleteStudent(int id);
}
