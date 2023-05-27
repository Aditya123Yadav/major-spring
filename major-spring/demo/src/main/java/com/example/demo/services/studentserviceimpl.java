package com.example.demo.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Model.Student;
import com.example.demo.dao.Studentdao;

@Service
public class studentserviceimpl implements Studentservices {
	@Autowired
	private Studentdao studentdao;

	@Override
	public Student addStudent(Student student) {
		studentdao.save(student);
		return student;
	
	}

	@Override
	public List<Student> getStudents() {
		
		return studentdao.findAll();
		}

	@Override
	public Student updateStudent(Student student) {
		 studentdao.save(student);
		 return student;
		 
	}

	@Override
	public Student deleteStudent(long Studentid) {
		Student student=studentdao.findById(Studentid).get();
		  studentdao.delete(student);
		return student;
		
	}

	@Override
	public String uploadImage(String path, MultipartFile file) throws IOException  {
		
		// file name
		String name=file.getOriginalFilename();
		
		//Path
		String filePath=path+ File.separator+name;
		
		 //creating folder if not
		File f= new File(path);
		if (!f.exists()) {
			f.mkdir();
		}
		
		//file copy
		Files.copy(file.getInputStream(), Paths.get(filePath));
		
		
		return name;
		
	}

	@Override
	public InputStream getResource(String path, String fileName) throws FileNotFoundException {
		String fullPath=File.separator+fileName;
		InputStream is= new FileInputStream(fullPath);
		return is;
	}

	
	}
	
  
	

