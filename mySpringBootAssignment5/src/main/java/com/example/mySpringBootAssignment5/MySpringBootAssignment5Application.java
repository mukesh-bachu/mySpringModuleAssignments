package com.example.mySpringBootAssignment5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MySpringBootAssignment5Application {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootAssignment5Application.class, args);
	}
	@GetMapping("/hello")
	public Greeting getGreeting() {
        return new Greeting("Hi, Good Evening!");
    }

    static class Greeting {
        private final String greeting;

        public Greeting(String greeting) {
            this.greeting = greeting;
        }

        public String getMessage() {
            return greeting;
        }
    }
    
    @PostMapping("/printing")
    public void postRequest(@RequestBody String requestBody) {
    	System.out.println("The request body sent is: "+ requestBody);
    }

}
