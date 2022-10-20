package com.spring.demo2restRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Demo2restEntity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{
	

}
