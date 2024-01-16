package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Modal.Student;

@Repository
public interface MyRestApiRepo extends JpaRepository<Student, Integer> {
	
}
