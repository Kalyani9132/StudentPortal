package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	public StudentResponse createStudent(@RequestBody(required = true) StudentAppEntity appEntity) {
		StudentResponse response = service.createstudent(appEntity);

		return response;
	}

}
