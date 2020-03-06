package com.nt.yadav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootApplicationBasicApplication {
   
	//private Contact contact;
	@GetMapping("/get")
	public Contact getContact() {
		Contact c=new Contact();
		c.setContactNumber(814294);
		c.setContactName("Sudharshan");
		c.setContactAddrs("Kadapa");
		
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println("SUDHARSHAN YADAV");
		SpringApplication.run(SpringBootApplicationBasicApplication.class, args);
	}

}
