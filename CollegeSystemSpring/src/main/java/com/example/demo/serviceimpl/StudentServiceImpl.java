package com.example.demo.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
@Autowired
StudentRepository studentRepository;
public StudentServiceImpl(StudentRepository studentRepository) {
	super();
    this.studentRepository=studentRepository;
}
	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getStudent() {
		List<Student> s1=studentRepository.findAll();
		return s1;
	}

	@Override
	public Student updateStudent(Student student) {
		Student s1=studentRepository.findById(student.getId()).get();
		s1.setId(student.getId());
		s1.setFname(student.getFname());
		s1.setLname(student.getLname());
		s1.setEmail(student.getEmail());
		s1.setMobno(student.getMobno());
		s1.setPan(student.getPan());
		s1.setPan(student.getPan());
		s1.setCityString(student.getCityString());
		return s1;
	}

	@Override
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}

}
