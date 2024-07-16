package com.project.Service;

import java.util.List;

import com.project.Entity.StudentAppEntity;
import com.project.Response.StudentResponse;

public interface StudentAppService {
	public StudentResponse createstudent(StudentAppEntity entity)throws Exception;

	public List<StudentResponse> findAll();
	

}
