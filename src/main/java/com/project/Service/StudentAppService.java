package com.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entity.StudentAppEntity;
import com.project.Repository.StudentAppRepository;
import com.project.Response.StudentResponse;

@Service
public class StudentAppService {
	@Autowired
	public StudentAppRepository repository;

	public StudentResponse createstudent(StudentAppEntity entity) {
		StudentResponse response = new StudentResponse();
		StudentAppEntity studentAppEntity = repository.save(entity);
		response.setId(studentAppEntity.getId());
		response.setName(studentAppEntity.getName());
		response.setSection(studentAppEntity.getSection());
		return response;
	}

	public List<StudentAppEntity> getAllStudents() {
		return repository.findAll();

	}

}
