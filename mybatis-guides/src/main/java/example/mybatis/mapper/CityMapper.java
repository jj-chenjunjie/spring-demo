package example.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import example.mybatis.domain.City;

public interface CityMapper {
	
	@Select("select * from city where id = #{id}")
	City selectOne(int id);
	
	List<City> selectCities();
}
