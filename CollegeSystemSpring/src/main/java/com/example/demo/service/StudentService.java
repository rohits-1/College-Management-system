package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {
	Student addStudent(Student student);
	List<Student> getStudent();
	Student updateStudent(Student student);
	void deleteStudent(int id);
}
