package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentResponse;
import com.example.demo.repository.StudentSurveyRepo;
import com.example.demo.service.StudentSurveyService;

@RestController
@RequestMapping(value = "/api/survey/")
public class StudentSurveyController {
	
	private StudentSurveyService studentSurveyService;

	public StudentSurveyController(StudentSurveyService studentSurveyService) {
		super();
		this.studentSurveyService = studentSurveyService;
	}
	
	//Save all the surveys	
	@PostMapping
	public String saveStudentSurvey(@RequestBody StudentResponse student){
		return "ok"; //new ResponseEntity<StudentResponse>(studentSurveyService.saveStudentSurvey(student), HttpStatus.CREATED);
	}
	//ResponseEntity<StudentResponse>
	//getting all surveys
	@GetMapping("/allSurveys")
	public List<StudentResponse> getAllSurveys(){
		return studentSurveyService.getAllSurvey();
	}
}
