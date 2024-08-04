package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Department;
import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.service.TeacherService;
@Service
public class TeacherServiceImpl implements TeacherService {
@Autowired
TeacherRepository teacherRepository;
public TeacherServiceImpl() {
	super();
	this.teacherRepository=teacherRepository;
}
	@Override
	public Teacher addTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@Override
	public List<Teacher> getTeacher() {
		List<Teacher> t1=teacherRepository.findAll();
		return t1;
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		Teacher t1=teacherRepository.findById(teacher.getId()).get();
		t1.setId(teacher.getId());
		t1.setName(teacher.getName());
		t1.setDept(teacher.getDept());
		t1.setCity(teacher.getCity());
		t1.setSalery(teacher.getSalery());
		return t1;
	}

	@Override
	public void deleteTeacher(int id) {
	    teacherRepository.deleteById(id);	

		
	}

}
