package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Student;

public interface Studentdao extends JpaRepository<Student, Long > {
	 
	

}
