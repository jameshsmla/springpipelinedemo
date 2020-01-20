package com.pratian.pripelinedemoproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCotroller {

	@GetMapping("/")
	public String hello() {
		return "hello world";
	}
}
