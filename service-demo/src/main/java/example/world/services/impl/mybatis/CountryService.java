package example.world.services.impl.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.world.domain.Country;
import example.world.mapper.CountryMapper;
import example.world.services.ICountryService;


@Service
public class CountryService implements ICountryService {
	
	@Autowired
	private CountryMapper countryMapper;

	@Override
	public Country getCountry(String code) {
		return countryMapper.selectCountry(code);
	}
	
}
