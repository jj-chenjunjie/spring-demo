package test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.Config;
import example.mybatis.domain.City;
import example.mybatis.service.CityService;
import example.mybatis.service.Service;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes={Config.class})
public class ServiceTest {
	
	@Autowired
	private Service<City> service;
	
	
	
	@Test
	public void test() {
		System.out.println("ServiceTest.test()");
//		List<Map<String, Object>> cities = this.service.findAll();
		List<City> cities = this.service.list();
		System.out.println(cities.size());
	}
	
//	@Autowired
//	private CityService service;
	
}
