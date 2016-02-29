package test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.Config;
import example.mybatis.domain.City;
import example.mybatis.service.CityService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes={Config.class})
public class ServiceTest {
	
//	private Service<City> service = new Service<>();
	
	
	
	@Test
	public void test() {
		System.out.println("ServiceTest.test()");
		List<City> cities = this.service.findAll();
		System.out.println(cities.size());
	}
	
	@Autowired
	private CityService service;
	
}
