package com.example.formdemo.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.formdemo.model.Student;
import com.example.formdemo.service.StudentRepository;

@Controller
public class DemoController {
	
	@Autowired
	private StudentRepository studentRepository;
	

	@RequestMapping(value ="/demo",method=RequestMethod.GET)
	public String demo(@ModelAttribute("student") Student student,Model model){
		model.addAttribute("student", student);
		System.out.println("Inside demo method");
		return "demo";
	}
	
	@RequestMapping(value ="/loadHome",method=RequestMethod.POST)
	public String loadHome(@Valid Student student, BindingResult bindingResult,Model model){
		studentRepository.save(student);
		System.out.println("Inside Load method");
		return "home";
	}
}
