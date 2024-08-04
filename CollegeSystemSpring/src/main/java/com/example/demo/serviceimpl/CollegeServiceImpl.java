package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.College;
import com.example.demo.repository.CollegeRepository;
import com.example.demo.service.CollegeService;

@Service
public class CollegeServiceImpl implements CollegeService {
	
	@Autowired
	CollegeRepository collegeRepository;
	public CollegeServiceImpl(CollegeRepository collegeRepository) {
		super();
		this.collegeRepository=collegeRepository;
	}

	@Override
	public College addCollege(College college) {
		return collegeRepository.save(college);
	}
	@Override
	public List<College> GetCollege() {
		List<College> c1=collegeRepository.findAll();
		return c1;
	}

	@Override
	public College updateCollege(College college) {
		College c1=collegeRepository.findById(college.getRegno()).get();
		c1.setName(college.getName());
		c1.setLocationString(c1.getLocationString());;
		return c1;
	}

	@Override
	public void deleteCollege(int id) {
    collegeRepository.deleteById(id);	
	}

	@Override
	public College getByIdCollege(int regno) {
		College c1=collegeRepository.findById(regno).get();
		return c1;
	}
}
