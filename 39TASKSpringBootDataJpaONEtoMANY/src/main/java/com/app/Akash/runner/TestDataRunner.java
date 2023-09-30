package com.app.Akash.runner;




import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.Akash.entity.Module;
import com.app.Akash.entity.Project;
import com.app.Akash.repo.ModuleRepository;
import com.app.Akash.repo.ProjectRepository;
@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private ModuleRepository mrepo;
	@Autowired
	private ProjectRepository prepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Module m1 = new Module(1501, "TAX", "Akash");
		Module m2 = new Module(1502, "BAT", "Ganesh");
		Module m3 = new Module(1503, "BOX", "Ankit");
		
		mrepo.save(m1);
		mrepo.save(m2);
		mrepo.save(m3);
		
		Project pro = new Project(2301, "ONLINE", "GOD",Arrays.asList(m1,m2,m3)); 
				
		prepo.save(pro);
	}

}
