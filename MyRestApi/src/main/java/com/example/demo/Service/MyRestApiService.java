package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Modal.Student;
import com.example.demo.Repository.MyRestApiRepo;

@Service
public class MyRestApiService {
	
	@Autowired
	MyRestApiRepo repo;
	public ResponseEntity<String> addStudent(Student stud){
		try {
			repo.save(stud);
			return new ResponseEntity<>("Ok, 1 row created",HttpStatus.CREATED);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>("Failed", HttpStatus.NOT_ACCEPTABLE);
	}
	public ResponseEntity<List<Student>> getStudent() {
		// TODO Auto-generated method stub
		try {
			return new ResponseEntity<>(repo.findAll(),HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
	}
	public ResponseEntity<String> updateStudent(Student stud) {
		// TODO Auto-generated method stub
		try {
			repo.save(stud);
			return new ResponseEntity<>("Ok, 1 row updated",HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>("Failed",HttpStatus.NOT_ACCEPTABLE);
	}
	public ResponseEntity<String> deleteStudent(int rollno) {
		// TODO Auto-generated method stub
		try {
			repo.deleteById(rollno);
			return new ResponseEntity<>("Ok, 1 row deleted", HttpStatus.OK);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return new ResponseEntity<>("Failed",HttpStatus.BAD_REQUEST);
	}
}
