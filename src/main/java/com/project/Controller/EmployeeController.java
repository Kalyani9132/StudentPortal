package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entity.EmployeeEntity;
import com.project.Response.EmployeeResponse;
import com.project.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/createEmlpoyee")
	public ResponseEntity<EmployeeResponse> createEmployee(@RequestBody(required = true) EmployeeEntity entity)
			throws Exception {
		EmployeeResponse response = null;
		try {
			response = service.createEmployee(entity);
		} catch (Exception e) {
			return new ResponseEntity<EmployeeResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<EmployeeResponse>(response, HttpStatus.ACCEPTED);

	}

	@GetMapping("/getEmployees")
	public ResponseEntity<List<EmployeeResponse>> getAllEmployees() {
		List<EmployeeResponse> responses = null;
		try {
			responses = service.getAllEmployees();
		} catch (Exception e) {
			return new ResponseEntity<List<EmployeeResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);

		}

		return new ResponseEntity<List<EmployeeResponse>>(responses, HttpStatus.OK);
	}

}
