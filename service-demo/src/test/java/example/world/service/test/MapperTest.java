package example.world.service.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import example.config.DatabaseConfiguation;
import example.config.ServiceConfiguation;
import example.world.domain.City;
import example.world.domain.Country;
import example.world.mapper.CityMapper;
import example.world.mapper.CountryMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes={ServiceConfiguation.class, DatabaseConfiguation.class})
public class MapperTest {

	@Autowired
	private CountryMapper countryMapper;
	
	@Autowired
	private CityMapper cityMapper;
	
	@Test
	public void selectCountry() {
		System.out.println("MapperTest.selectCountry()");
		Country country = this.countryMapper.selectCountry("CHN");
		System.out.println(country.getName());
		System.out.println(country.getCities().size());
	}
	
	@Test
	public void getCity() {
		System.out.println("MapperTest.getCity()");
		City city = this.cityMapper.getCity(1);
		System.out.println(city.getId());
		
	}
	
	@Test
	public void selectCitiesForCountry() {
		System.out.println("MapperTest.selectCitiesForCountry()");
		List<City> cities = this.cityMapper.selectCitiesForCountry("CHN");
		System.out.println(cities.size());
	}

}
