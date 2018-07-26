package com.optum.form;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/demo")
	@ResponseBody
	public String demo(@RequestBody Student student){
		System.out.println("Inside demo method");
		System.out.println(student.getStudentName());
		System.out.println(student.getClassId());
		System.out.println(student.getPhoneNum());
		System.out.println(student.getStudentEmail());
		studentRepository.save(student);
		return "Done";
	}
}
