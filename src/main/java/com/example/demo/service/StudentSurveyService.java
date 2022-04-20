package com.example.demo.service;

import java.util.List;

import com.example.demo.model.StudentResponse;

public interface StudentSurveyService {
	StudentResponse saveStudentSurvey(StudentResponse studentResponse);
	List<StudentResponse> getAllSurvey();
}
