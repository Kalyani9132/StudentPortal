package com.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entity.StudentAppEntity;
import com.project.Repository.StudentAppRepository;

@Service
public class StudentAppService {
	@Autowired
	public StudentAppRepository repository;
	public StudentAppEntity createstudent(StudentAppEntity entity) {
	return repository.save(entity) ;
	}
	public List<StudentAppEntity> getAllStudents(){
		return repository.findAll();
		
	}

}
