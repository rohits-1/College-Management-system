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
import com.example.demo.model.Department;
import com.example.demo.serviceimpl.DeptServiceImpl;

@RestController
@RequestMapping("/Home1")
public class DepartmentController {
	@Autowired
	DeptServiceImpl deptServiceImpl;
	public DepartmentController(DeptServiceImpl deptServiceImpl) {
		super();
		this.deptServiceImpl = deptServiceImpl;
	}

	@GetMapping("/displayDepartment{id}")
	public ResponseEntity<List<Department>> getDeptEntity(@PathVariable("id") int id) {
		List<Department> d1 = deptServiceImpl.getDepartment();
		return new ResponseEntity<>(d1, HttpStatus.OK);
	}

	@PostMapping("/saveDepartment")
	public ResponseEntity<Department> addDeptEntity(@RequestBody Department department) {
		Department d1 = deptServiceImpl.addDepartment(department);
		return new ResponseEntity<>(d1, HttpStatus.OK);
	}

	@PutMapping("/Department{id}")
	public ResponseEntity<Department> updateDeptEntity(@PathVariable("id") int id, @RequestBody Department department) {
		department.setId(id);
		Department d1 = deptServiceImpl.updateDepartment(department);
		return new ResponseEntity<>(d1, HttpStatus.OK);
	}

	@DeleteMapping("/Department{id}")
	public ResponseEntity<String> deleteDeptEntity(@PathVariable("id") int id) {
		deptServiceImpl.deleteDepartment(id);
		return new ResponseEntity<>("Data Deleted Sucessfully", HttpStatus.OK);
	}
}