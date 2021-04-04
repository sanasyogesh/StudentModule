package org.practice.StudentModule.dao;

import org.practice.StudentModule.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends CrudRepository<Student, Integer> {

	
	
}
