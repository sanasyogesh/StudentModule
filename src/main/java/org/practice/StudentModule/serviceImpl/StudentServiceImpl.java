package org.practice.StudentModule.serviceImpl;

import org.practice.StudentModule.dao.StudentDao;
import org.practice.StudentModule.model.Student;
import org.practice.StudentModule.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;
	
	@Override
	public Student newRegistration(Student student) {
		return (Student) studentDao.save(student);
		
	}
}
