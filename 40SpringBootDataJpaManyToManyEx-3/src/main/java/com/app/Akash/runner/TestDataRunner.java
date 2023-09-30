package com.app.Akash.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Akash.entity.Course;
import com.app.Akash.entity.Student;
import com.app.Akash.repo.CourseRepository;
import com.app.Akash.repo.StudentRepository;
@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository srepo;
	
	@Autowired
	private CourseRepository crepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Course c1 = new Course(10,"Core Java",2000.0);
		Course c2 = new Course(10,"ADV Java",2000.0);
		Course c3 = new Course(10,"SPRING",2000.0);
		
		crepo.save(c1);
		crepo.save(c2);
		crepo.save(c3);
		
		
		Student s1 = new Student(9001, "AJAY" ,"HYD", Arrays.asList(c1,c2));
		Student s2 = new Student(9002, "SAM" ,"BANG", Arrays.asList(c2,c3));
		Student s3 = new Student(9003, "SONY" ,"GOA", Arrays.asList(c1,c2,c3));
	
		
		srepo.save(s1);
		srepo.save(s2);
		srepo.save(s3);
		
	}

}
