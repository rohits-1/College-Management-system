package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.College;
import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	DepartmentRepository departmentRepository;
	public DeptServiceImpl(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository=departmentRepository;
	}

	@Override
	public Department addDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> getDepartment() {
		List<Department> d1=departmentRepository.findAll();
		return d1;
	}

	@Override
	public Department updateDepartment(Department department) {
		Department d1=departmentRepository.findById(department.getId()).get();
		d1.setId(department.getId());
		d1.setName(department.getName());
		return d1;
	}

	@Override
	public void deleteDepartment(int id) {
    departmentRepository.deleteById(id);		
	}


}
