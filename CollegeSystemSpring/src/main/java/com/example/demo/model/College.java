package com.example.demo.model;

import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int regno;
private String name;
private String locationString;
@OneToMany
private List<Student> students;
@OneToMany
private List<Teacher> teachers;
@OneToMany
private List<Department> departments;
public College() {
	super();
}
public int getRegno() {
	return regno;
}
public void setRegno(int regno) {
	this.regno = regno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocationString() {
	return locationString;
}
public void setLocationString(String locationString) {
	this.locationString = locationString;
}
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}
public List<Teacher> getTeachers() {
	return teachers;
}
public void setTeachers(List<Teacher> teachers) {
	this.teachers = teachers;
}
public List<Department> getDepartments() {
	return departments;
}
public void setDepartments(List<Department> departments) {
	this.departments = departments;
}
@Override
public String toString() {
	return "College [regno=" + regno + ", name=" + name + ", locationString=" + locationString + ", students="
			+ students + ", teachers=" + teachers + ", departments=" + departments + "]";
}
public College(int regno, String name, String locationString, List<Student> students, List<Teacher> teachers,
		List<Department> departments) {
	super();
	this.regno = regno;
	this.name = name;
	this.locationString = locationString;
	this.students = students;
	this.teachers = teachers;
	this.departments = departments;
}

}

