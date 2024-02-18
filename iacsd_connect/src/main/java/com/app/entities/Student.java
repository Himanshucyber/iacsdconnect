package com.app.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="students")
public class Student {
	
	@Column(length=30)
	private String firstName;
	
	@Column(length=30)
	private String lastName;
	
	@Column(length=10,unique=true,nullable=false)
	private String rollNo;
	
	@Column(length=20,unique=true,nullable=false)
	private String prn;
	
	
	@Column(length=30,unique=true,nullable=false)
	private String email;
	
	@Column(length=20,nullable=false)
	private String password;
	
//	@Column(length=20)
	@ManyToOne
	@JoinColumn(name="course_id")
	private String courseID;
	
	private List<Course> courses;	

}
