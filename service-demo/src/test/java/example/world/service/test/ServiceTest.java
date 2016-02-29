package example.world.service.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import example.config.DatabaseConfiguation;
import example.config.ServiceConfiguation;
import example.world.domain.Country;
import example.world.mapper.CityMapper;
import example.world.services.ICountryService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes={ServiceConfiguation.class, DatabaseConfiguation.class})
public class ServiceTest {

	@Autowired
	private ICountryService countryService;
	
	@Autowired
	private CityMapper cityMapper;
	
	
	@Test
	public void getCountryTest() {
		Country country = countryService.getCountry("CHN");
		System.out.println(country.getName());
		System.out.println(country.getCities().size());
	}

	
}
