package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String dept;
private String city;
private float salery;
@OneToMany
private List<Student> students;
public Teacher() {
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
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public float getSalery() {
	return salery;
}
public void setSalery(float salery) {
	this.salery = salery;
}
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}

@Override
public String toString() {
	return "Teacher [id=" + id + ", name=" + name + ", dept=" + dept + ", city=" + city + ", salery=" + salery
			+ ", students=" + students + "]";
}
public Teacher(int id, String name, String dept, String city, float salery, List<Student> students,
		Department department, College college) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.city = city;
	this.salery = salery;
	this.students = students;
}

}
