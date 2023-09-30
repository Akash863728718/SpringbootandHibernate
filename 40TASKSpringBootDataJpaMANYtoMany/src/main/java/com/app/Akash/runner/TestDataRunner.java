package com.app.Akash.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Akash.entity.Role;
import com.app.Akash.entity.User;
import com.app.Akash.repo.RoleRepository;
import com.app.Akash.repo.UserRepository;
@Component
public class TestDataRunner implements CommandLineRunner {
	
	@Autowired
	private UserRepository urepo;
	@Autowired
	private RoleRepository rrepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Role r1 = new Role("GO","AJAY","PARK");
		Role r2 = new Role("WENT","GANESH","GARDEN");
		Role r3 = new Role("GONE","AKASH","OYO");
		
		rrepo.save(r1);
		rrepo.save(r2);
		rrepo.save(r3);
		
		User u1 = new User(9001, "BHD" ,"HYD", Arrays.asList(r1,r2));
	    User u2 = new User(9002, "SAM" ,"BANG", Arrays.asList(r2,r3));
		User u3 = new User(9003, "SONY" ,"GOA", Arrays.asList(r1,r2,r3));
	
		
		urepo.save(u1);
		urepo.save(u2);
		urepo.save(u3);
		
	}

}
