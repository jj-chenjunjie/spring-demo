package example.mybatis.mapper;

import java.util.List;
import java.util.Map;

public interface Mapper<T> {
	
	T get(int id);
	
	List<Map<String, Object>> findAll();
	
}
