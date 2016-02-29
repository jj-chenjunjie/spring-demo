package example.springmvc.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping("{tid}")
	public String test(@PathVariable String tid) {
		
		List<Map<String, Object>> cities = jdbcTemplate.queryForList("select * from city");
//		System.out.println("TestController.test(): " + tid + ", " + cities.size());
		return tid;
	}
	
}
