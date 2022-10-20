package com.spring.Demo2estController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Demo2estService.StudentServiceImpl;
import com.spring.Demo2restEntity.Student;

@RestController
public class StudentController {

	
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	@GetMapping("/getStudent")
	public List<Student> getCourse(){
		return this.studentServiceImpl.getCourse();
	}
	
	@PostMapping("/addStudent")
	public Student addCourse(@RequestBody Student student){
		return this.studentServiceImpl.addStudent(student);
	}
	
	@PostMapping("/updateStudent/{sid}")
	public Student updateStudent(@RequestBody Student student){
		return this.studentServiceImpl.updateStudent(student);
	}
	
	@DeleteMapping("/deleteStudent/{sid}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable Integer sid){
		try {
			this.studentServiceImpl.deleteStudent(sid);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
