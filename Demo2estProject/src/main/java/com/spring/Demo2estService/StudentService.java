package com.spring.Demo2estService;

import java.util.List;

import com.spring.Demo2restEntity.Student;


public interface StudentService {
	
	public List<Student> getCourse();

	public Student addStudent(Student student);

	public Student updateStudent(Student student);

	public void deleteStudent(Integer sid);

}
