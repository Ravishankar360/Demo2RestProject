package com.spring.Demo2estService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Demo2restEntity.Student;
import com.spring.demo2restRepository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getCourse() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		return student;
	}

	@Override
	public void deleteStudent(Integer sid) {
		Student Entity = studentRepository.getOne(sid);
		studentRepository.delete(Entity);
	}
	
	

}
