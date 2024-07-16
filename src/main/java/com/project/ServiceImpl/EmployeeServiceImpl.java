package com.project.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entity.EmployeeEntity;
import com.project.Repository.EmployeeRepository;
import com.project.Response.EmployeeResponse;
import com.project.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeRepository repository;

	public EmployeeResponse createEmployee(EmployeeEntity entity) throws Exception {
		EmployeeResponse response = new EmployeeResponse();
		try {
			EmployeeEntity employeeentity = repository.save(entity);
			if (null == employeeentity) {
				throw new Exception("No data");
			}
			response.setId(employeeentity.getId());
			response.setName(employeeentity.getName());
			response.setAddress(employeeentity.getAddress());

		} catch (Exception e) {
			throw e;
		}

		return response;
	}

	@Override
	public List<EmployeeResponse> getAllEmployees() {
		List<EmployeeResponse> resList = new ArrayList<>();
		List<EmployeeEntity> Entities = repository.findAll();

		for (EmployeeEntity Entity : Entities) {

			EmployeeResponse res = new EmployeeResponse();
			res.setId(Entity.getId());
			res.setName(Entity.getName());
			res.setAddress(Entity.getAddress());

			resList.add(res);

		}
return resList;
	}
}