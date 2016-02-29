package example.spring.mvc.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.spring.domain.Person;

@RestController
public class WebController {

	@RequestMapping("person")
	public Person validatePersonInfo(@Valid Person person) {
		System.out.println("WebController.validatePersonInfo()");
		return person;
	}
	
	@RequestMapping("/")
	public String hello() {
		return "hello world";
	}
}
