package example.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface GenericMapper<T> {
	
	
	@Select("select * from ${tableName} where id = #{id}")
	T get(int id, String tableName);
	
//	@Select("select * from ${tableName}")
//	List<Map<String, Object>> findAll(MapperParameter parameter);
	
	@Select("select * from ${tableName}")
	List<T> findAll(@Param("tableName") String tableName);
	
}
