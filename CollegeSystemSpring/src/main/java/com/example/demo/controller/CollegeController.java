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

import com.example.demo.model.College;
import com.example.demo.model.Teacher;
import com.example.demo.serviceimpl.CollegeServiceImpl;

@RestController
@RequestMapping("/Home")
public class CollegeController {
	@Autowired
	CollegeServiceImpl collegeServiceImpl;

	public CollegeController(CollegeServiceImpl collegeServiceImpl) {
		super();
		this.collegeServiceImpl = collegeServiceImpl;
	}

	@GetMapping("/displayCollege{regno}")
	public ResponseEntity<List<College>> getCollegeEntity(@PathVariable("regno") int regno) {
		List<College> c1 = collegeServiceImpl.GetCollege();
		return new ResponseEntity<>(c1, HttpStatus.OK);
	}

	@PostMapping("/saveCollege")
	public ResponseEntity<College> addCollEntity(@RequestBody College college) {
		College c1 = collegeServiceImpl.addCollege(college);
		return new ResponseEntity<>(c1, HttpStatus.OK);
	}

	@PutMapping("/College{regno}")
	public ResponseEntity<College> updateCollEntity(@PathVariable("regno") int regno, @RequestBody College college) {
		college.setRegno(regno);
		College c1 = collegeServiceImpl.updateCollege(college);
		return new ResponseEntity<>(c1, HttpStatus.OK);
	}

	@DeleteMapping("/College{regno}")
	public ResponseEntity<String> deleteCollEntity(@PathVariable("regno") int regno) {
		collegeServiceImpl.deleteCollege(regno);
		return new ResponseEntity<>("Data Deleted Sucessfully", HttpStatus.OK);
	}
	@GetMapping("/displaybyidcollege{regno}")
	public ResponseEntity <College> getByIdCollege(@PathVariable("regno") int regno) {
		College c1=collegeServiceImpl.getByIdCollege(regno);
		return new ResponseEntity<>(c1, HttpStatus.OK);
	}
}