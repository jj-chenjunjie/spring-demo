package example.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

public interface GenericMapper<T> {
	
	
	@Select("select * from ${tableName} where id = #{id}")
	T get(int id, String tableName);
	
	@Select("select * from ${tableName}")
	List<Map<String, Object>> findAll(MapperParameter parameter);
	
}
