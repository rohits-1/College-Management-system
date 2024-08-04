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
import com.example.demo.model.Teacher;
import com.example.demo.serviceimpl.TeacherServiceImpl;

@RestController
@RequestMapping("/Home3")
public class TeacherController {
	@Autowired
	TeacherServiceImpl teacherServiceImpl;

	public TeacherController(TeacherServiceImpl teacherServiceImpl) {
		super();
		this.teacherServiceImpl = teacherServiceImpl;
	}

	@GetMapping("/displayTeacher{id}")
	public ResponseEntity<List<Teacher>> getTeacherEntity(@PathVariable("id") int id) {
		List<Teacher> t1 = teacherServiceImpl.getTeacher();
		return new ResponseEntity<>(t1, HttpStatus.OK);
	}

	@PostMapping("/saveTeacher")
	public ResponseEntity<Teacher> addTeacherEntity(@RequestBody Teacher teacher) {

		Teacher t1 = teacherServiceImpl.addTeacher(teacher);
		return new ResponseEntity<>(t1, HttpStatus.OK);
	}

	@PutMapping("/Teacher{id}")
	public ResponseEntity<Teacher> updateTeacherEntity(@PathVariable("id") int id, @RequestBody Teacher teacher) {
		teacher.setId(id);
		Teacher t1 = teacherServiceImpl.updateTeacher(teacher);
		return new ResponseEntity<>(t1, HttpStatus.OK);
	}

	@DeleteMapping("/Teacher{id}")
	public ResponseEntity<String> deleteTeacherEntity(@PathVariable("id") int id) {
		teacherServiceImpl.deleteTeacher(id);
		return new ResponseEntity<>("Data Deleted Sucessfully", HttpStatus.OK);
	}
}
