package example.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import example.mybatis.domain.City;

public interface CityMapper extends Mapper<City>{
	
	@Select("select * from city where id = #{id}")
	City getCity(int id);
	
	List<City> selectCities();
	
}
