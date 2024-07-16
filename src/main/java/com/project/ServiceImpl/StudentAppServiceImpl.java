package com.project.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entity.StudentAppEntity;
import com.project.Repository.StudentAppRepository;
import com.project.Response.StudentResponse;
import com.project.Service.StudentAppService;

@Service
public class StudentAppServiceImpl implements StudentAppService {
	@Autowired
	public StudentAppRepository repository;

	public StudentResponse createstudent(StudentAppEntity entity) throws Exception {
		StudentResponse response = new StudentResponse();
		try {
			StudentAppEntity studentAppEntity = repository.save(entity);
			if(null==studentAppEntity) {
				throw new Exception("No data");
			}
			response.setId(studentAppEntity.getId());
			response.setName(studentAppEntity.getName());
			response.setSection(studentAppEntity.getSection());
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		return response;

	}

	@Override
	
	public List<StudentResponse> findAll() {
		List<StudentResponse> resList = new ArrayList<>();
		List<StudentAppEntity> appEntities = repository.findAll();
		
		for (StudentAppEntity appEntity : appEntities) {
			
			StudentResponse res = new StudentResponse();
			res.setId(appEntity.getId());
			res.setName(appEntity.getName());
			res.setSection(appEntity.getSection());
			
			resList.add(res);

		}

		return resList;
	}

}
