package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Department;

public interface DeptService {
	Department addDepartment(Department department);
	List<Department> getDepartment();
	Department updateDepartment(Department department);
	void deleteDepartment(int id);
}
