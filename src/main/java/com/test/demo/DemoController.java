package com.test.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class DemoController {

	@Value("${spring.profiles.active:}")
	private String activeProfile;
	@GetMapping("/foo")
	public String foo(@RequestParam(defaultValue = "foo") String hello){

		return hello;

	}

	@GetMapping("/bar")
	public String bar(@RequestParam(defaultValue = "bar") String hello){

		return hello;

	}


	@GetMapping
	public String profile() {
		log.info("hello");
		return activeProfile;
	}
}
