package example.world.mapper;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import example.world.domain.Country;

public interface CountryMapper {
	
	@Select("select * from country where code = #{code}")
	@Results({
		@Result(column="code", property="cities", many=@Many(select="example.world.mapper.CityMapper.selectCitiesForCountry"))
	})
	Country selectCountry(String code);
	
}
