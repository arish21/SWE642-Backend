package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentResponse;
import com.example.demo.repository.StudentSurveyRepo;
import com.example.demo.service.StudentSurveyService;



@Service
public class StudentSurveyServiceImpl implements StudentSurveyService{
	
	
	@Autowired
	private StudentSurveyRepo studentSurveyRepo;
	
	@Override
	public StudentResponse saveStudentSurvey(StudentResponse studentResponse) {
		return studentSurveyRepo.save(studentResponse);
	}
	@Override
	public List<StudentResponse> getAllSurvey(){
		return studentSurveyRepo.findAll();
	}
}
