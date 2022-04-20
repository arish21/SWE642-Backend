package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StudentResponse;

public interface StudentSurveyRepo extends JpaRepository<StudentResponse, String> {

}
