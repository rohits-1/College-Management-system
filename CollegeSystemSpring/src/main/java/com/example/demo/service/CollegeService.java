package com.example.demo.service;

import java.util.List;

import com.example.demo.model.*;
public interface CollegeService {
	College addCollege(College college);
	List<College> GetCollege();
	College updateCollege(College college);
	void deleteCollege(int id);
	College getByIdCollege(int regno);
}
