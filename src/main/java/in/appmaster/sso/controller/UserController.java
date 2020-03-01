package in.appmaster.sso.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class UserController {
	
	@GetMapping("/me")
	public String echoTheUsersEmailAddress(Principal principal) {
	   return "Hey there! Your email address is: " + principal.getName();
	}
	
	@GetMapping("/greet")
	public String greet() {
	   return "Hey there! "; 
	}



}
