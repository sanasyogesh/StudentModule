package org.practice.StudentModule.controller;

import org.practice.StudentModule.model.Student;
import org.practice.StudentModule.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
//@RequestMapping(value="/registration")
public class RegistrationController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping(value="/newRegistration", method=RequestMethod.POST)
	public ModelAndView newRegistraion(@ModelAttribute("student")Student student) {
		System.out.println("Inside New Registration Form...");
		ModelAndView modelAndView = new ModelAndView("RegistrationStatus");
		Student stud = studentService.newRegistration(student);
		System.out.println("Form Submitted Successfully..."+ stud.getFirstName()+ " "+stud.getLastName());
		return modelAndView;
 	}
	
	
}

