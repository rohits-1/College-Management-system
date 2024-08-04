package com.example.demo.model;

import java.util.List;
import java.util.Set;

//import com.example.demo.entity.Teacher;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToMany
    private List<Teacher> teachers;
    @OneToMany
    private List<Student> students;
	public Department() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", teachers=" + teachers + ", students=" + students
				+ "]";
	}
	public Department(int id, String name, List<Teacher> teachers, List<Student> students, College colleges) {
		super();
		this.id = id;
		this.name = name;
		this.teachers = teachers;
		this.students = students;
	}
	
	
}