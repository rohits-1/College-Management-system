package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Student;
import com.example.demo.serviceimpl.StudentServiceImpl;

@RestController
@RequestMapping("/Home2")
public class StudentController {
	@Autowired
	StudentServiceImpl studentServiceImpl;

	public StudentController(StudentServiceImpl studentServiceImpl) {
		super();
		this.studentServiceImpl = studentServiceImpl;
	}

	@GetMapping("/displayStudent{id}")
	public ResponseEntity<List<Student>> getStudEntity(@PathVariable("id") int id) {
		List<Student> s1 = studentServiceImpl.getStudent();
		return new ResponseEntity<>(s1, HttpStatus.OK);
	}

	@PostMapping("/saveStudent")
	public ResponseEntity<Student> addStudEntity(@RequestBody Student student) {
		Student s1 = studentServiceImpl.addStudent(student);
		return new ResponseEntity<>(s1, HttpStatus.OK);
	}

	@PutMapping("/Student{id}")
	public ResponseEntity<Student> updateStudentEntity(@PathVariable("id") int id, @RequestBody Student student) {
		student.setId(id);
		Student s1 = studentServiceImpl.updateStudent(student);
		return new ResponseEntity<>(s1, HttpStatus.OK);
	}

	@DeleteMapping("/Student{id}")
	public ResponseEntity<String> deleteStudentEntity(@PathVariable("id") int id) {
		studentServiceImpl.deleteStudent(id);
		return new ResponseEntity<>("Data Deleted Sucessfully", HttpStatus.OK);
	}
}
