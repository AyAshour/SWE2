package com.swe.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

//@RestController
@SpringBootApplication
public class Swe2projectApplication {
	/*@RequestMapping("/")
	String home() {
		return "SWE2 project!";
	}*/
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Swe2projectApplication.class, args);
	}
}