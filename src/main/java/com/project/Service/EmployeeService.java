package com.project.Service;

import java.util.List;

import com.project.Entity.EmployeeEntity;
import com.project.Response.EmployeeResponse;


public interface EmployeeService {
	public EmployeeResponse createEmployee(EmployeeEntity entity)throws Exception;
	public List<EmployeeResponse> getAllEmployees();

}
