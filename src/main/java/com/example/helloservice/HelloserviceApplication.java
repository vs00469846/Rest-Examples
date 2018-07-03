package com.example.helloservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloserviceApplication.class, args);
	}
}

@RestController
@RequestMapping(path = "/test1")
class HelloController{
	 private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
	 

	@GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getConsumtionData(@RequestParam String name) {
		LOGGER.info("HelloController:"+name);
		return "ACC Tagged-"+name;
	}     
}
