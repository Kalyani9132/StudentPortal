package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entity.StudentAppEntity;
import com.project.Response.StudentResponse;
import com.project.Service.StudentAppService;

@RestController
public class StudentAppController {

	@Autowired
	private StudentAppService service;

	@PostMapping("/createStudent")
	public ResponseEntity<StudentResponse> createStudent(@RequestBody(required = true) StudentAppEntity appEntity) {
		StudentResponse response = null;
		try {
			response = service.createstudent(appEntity);
		} catch (Exception e) {
			return new ResponseEntity<StudentResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<StudentResponse>(response, HttpStatus.CREATED);
	}

	@GetMapping("/getStudent")
	public List<StudentResponse> getAllStudents() {
		return service.findAll();

	}

}
