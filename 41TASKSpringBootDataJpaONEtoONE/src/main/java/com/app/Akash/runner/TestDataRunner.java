package com.app.Akash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Akash.entity.Student;
import com.app.Akash.entity.StudentProfile;
import com.app.Akash.repo.StudentProfileRepository;
import com.app.Akash.repo.StudentRepository;
@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository srepo;
	@Autowired
	private StudentProfileRepository sprepo;
	
	
	public void run(String... args) throws Exception {
		
		Student s1 = new Student("1650", "ACTIVE","DEV-001");
		Student s2 = new Student("1651", "ACTIVE","QA-002");
		
		
		srepo.save(s1);
		srepo.save(s2);
		
		StudentProfile sp1 = new StudentProfile(4401.0, "AJAY", "MN091",s1);
		StudentProfile sp2 = new StudentProfile(4402.0, "AMIT", "MN092",s2);
		
		sprepo.save(sp1);
		sprepo.save(sp2);
	}

}
