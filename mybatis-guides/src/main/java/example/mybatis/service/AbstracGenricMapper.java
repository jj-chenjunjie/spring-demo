package example.mybatis.service;

import java.util.List;
import java.util.Map;

import example.mybatis.mapper.GenericMapper;
import example.mybatis.mapper.MapperParameter;

public class AbstracGenricMapper<T> implements GenericMapper<T>{
	
	@Override
	public T get(int id, String tableName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map<String, Object>> findAll(MapperParameter parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAll(String tableName) {
		// TODO Auto-generated method stub
		return null;
	}

}
