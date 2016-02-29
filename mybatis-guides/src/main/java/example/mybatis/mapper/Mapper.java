package example.mybatis.mapper;

import java.util.List;

public interface Mapper<T> {
	
	T get(int id);
	
	List<T> findAll();
	
}
