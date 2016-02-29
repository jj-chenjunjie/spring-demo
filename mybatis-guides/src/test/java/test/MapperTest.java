package test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.Config;
import example.mybatis.domain.City;
import example.mybatis.mapper.CityMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes={Config.class})
public class MapperTest {
	
	@Autowired
	private CityMapper cityMapper;
	
	@Test
	public void getCity() {
		System.out.println("MapperTest.getCity()");
		City city = this.cityMapper.getCity(1);
		System.out.println(city.getName());
	}
	
	@Test
	public void getCities() {
		System.out.println("MapperTest.getCities()");
		List<City> cities = this.cityMapper.selectCities();
		System.out.println(cities.size());
	}
	
}
