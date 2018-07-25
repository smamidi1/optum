package com.example.formdemo.service;

import org.springframework.data.repository.CrudRepository;

import com.example.formdemo.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {
	
}