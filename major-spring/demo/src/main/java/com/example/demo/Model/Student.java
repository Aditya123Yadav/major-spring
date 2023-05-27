package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)

	private Long Studentid;
	private String StudentName;
	private String Interests;
	private String Skills;
	private String Bio;
	private int Year;
	private String Branch;
	private String Photos;
	
	
	@Override
	public String toString() {
		return "Student [Studentid=" + Studentid + ", StudentName=" + StudentName + ", Interests=" + Interests + ", Skills="
				+ Skills + ", Bio=" + Bio + ", Year=" + Year + ", Branch=" + Branch + ",Photos=" +Photos +"]";
	}


	public Long getStudentid() {
		return Studentid;
	}


	public void setStudentid(Long studentid) {
		Studentid = studentid;
	}


	public String getStudentName() {
		return StudentName;
	}


	public void setStudentName(String studentName) {
		StudentName = studentName;
	}


	public String getInterests() {
		return Interests;
	}


	public void setInterests(String interests) {
		Interests = interests;
	}


	public String getSkills() {
		return Skills;
	}


	public void setSkills(String skills) {
		Skills = skills;
	}


	public String getBio() {
		return Bio;
	}


	public void setBio(String bio) {
		Bio = bio;
	}


	public int getYear() {
		return Year;
	}


	public void setYear(int year) {
		Year = year;
	}


	public String getBranch() {
		return Branch;
	}


	public void setBranch(String branch) {
		Branch = branch;
	}


	public Student(Long studentid, String studentName, String interests, String skills, String bio, int year,
			String branch,String photos) {
		super();
		Studentid = studentid;
		StudentName = studentName;
		Interests = interests;
		Skills = skills;
		Bio = bio;
		Year = year;
		Branch = branch;
		Photos=photos;
	}


	public Student() {
		super();
		
	}


	public String getPhotos() {
		return Photos;
	}


	public void setPhotos(String photos) {
		Photos = photos;
	}
	
	
	
	
}
