package com.example.helloworldsprin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloworldsprinApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloworldsprinApplication.class, args);



	}
	/*@RestController
	@RequestMapping(path="/")
	public class hello {
		@RequestMapping(value="m/{msgrequest}",method= RequestMethod.GET)
		public String ecrire(@PathVariable(value="") String msgrequest){

			return "Hello world et speciallement "+msgrequest;
		}*/

	}

