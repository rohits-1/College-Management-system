package com.example.demo.model;

import org.hibernate.boot.model.naming.ImplicitNameSource;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Fname;
	private String Lname;
	private String email;
	private long mobno;
	private String pan;
	private String adher;
	private String cityString;
	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getAdher() {
		return adher;
	}

	public void setAdher(String adher) {
		this.adher = adher;
	}

	public String getCityString() {
		return cityString;
	}

	public void setCityString(String cityString) {
		this.cityString = cityString;
	}

	

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", email=" + email + ", mobno=" + mobno
				+ ", pan=" + pan + ", adher=" + adher + ", cityString=" + cityString + "]";
	}

	public Student(int id, String fname, String lname, String email, long mobno, String pan, String adher,
			String cityString, Teacher teacher, Department department, College college) {
		super();
		this.id = id;
		Fname = fname;
		Lname = lname;
		this.email = email;
		this.mobno = mobno;
		this.pan = pan;
		this.adher = adher;
		this.cityString = cityString;
	}

	
}
