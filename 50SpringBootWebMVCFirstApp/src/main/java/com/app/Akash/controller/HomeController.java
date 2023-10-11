package com.app.Akash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/***
 * This annotation create object to our class
 * Also enables HTTP protocol support
 */
@Controller
public class HomeController {

	/***
	 * If Request contains URL that ends withs /show
	 * of type GET then FC will call this method and returns
	 * View Name "Home"
	 */
	
	@GetMapping("/show")	
	public String showHome() {
	
		return "Home";
	}
}
