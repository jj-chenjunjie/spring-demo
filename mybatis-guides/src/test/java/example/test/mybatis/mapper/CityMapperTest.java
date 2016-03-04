package example.test.mybatis.mapper;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cjj.springboot.test.SpringBootTest;
import example.mybatis.domain.City;
import example.mybatis.mapper.CityMapper;


public class CityMapperTest extends SpringBootTest{
	
	@Autowired
	private CityMapper cityMapper;

	@Test
	public void testSelectOne() {
		City city = this.cityMapper.selectOne(1);
		System.out.println(city.getName());
	}
	
	@Test
	public void testSelectCities() {
		List<City> cities = this.cityMapper.selectCities();
		System.out.println(cities.size());
	}

}
