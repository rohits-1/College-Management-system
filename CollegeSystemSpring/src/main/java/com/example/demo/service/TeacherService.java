package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Department;
import com.example.demo.model.Teacher;

public interface TeacherService {
	Teacher addTeacher(Teacher teacher);
	List<Teacher> getTeacher();
	Teacher updateTeacher(Teacher teacher);
	void deleteTeacher(int id);
}
