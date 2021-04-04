package org.practice.StudentModule.service;

import org.practice.StudentModule.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService{

	public Student newRegistration(Student student);
}
