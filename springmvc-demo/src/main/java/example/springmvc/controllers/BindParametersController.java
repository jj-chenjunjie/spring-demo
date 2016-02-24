package example.springmvc.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bp")
public class BindParametersController {
	
	@RequestMapping("hello")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("map")
	public Map<String, Object> map() {
		return null;
	}

}
