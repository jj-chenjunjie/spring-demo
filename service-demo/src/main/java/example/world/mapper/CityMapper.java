package example.world.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import example.world.domain.City;

public interface CityMapper {
	
	@Select("select * from city where countrycode = #{countryCode}")
	List<City> selectCitiesForCountry(String countryCode);
	
}
