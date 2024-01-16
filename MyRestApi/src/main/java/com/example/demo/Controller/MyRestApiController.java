package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Modal.Student;
import com.example.demo.Service.MyRestApiService;

@RestController
@RequestMapping("MyRestApi")
public class MyRestApiController {
	
	@Autowired
	MyRestApiService apiService;
	
	@PostMapping("add")
	public ResponseEntity<String>addStudent(@RequestBody Student stud){
		return apiService.addStudent(stud);
	}
	
	@GetMapping("get")
	public ResponseEntity<List<Student>>getStudent(){
		return apiService.getStudent();
	}
	
	@PutMapping("update")
	public ResponseEntity<String>updateStudent(@RequestBody Student stud){
		return apiService.updateStudent(stud);
	}
	
	@DeleteMapping("delete/{rollno}")
	public ResponseEntity<String>deleteStudent(@PathVariable int rollno){
		return apiService.deleteStudent(rollno);
	}
}
