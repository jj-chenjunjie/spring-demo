package example.mybatis.service;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import example.mybatis.mapper.GenericMapper;
import example.mybatis.mapper.Mapper;
import example.mybatis.mapper.MapperParameter;

public class Service<T> implements Mapper<T>{
	
	private Class<T> entityClass;
	
	private String tableName;
	
	
	public Service() {
		Type genType = this.getClass().getGenericSuperclass();  
        Type[] params = ((ParameterizedType)genType).getActualTypeArguments(); 
        entityClass = (Class) params[0]; 
		System.out.println("Service.Service()");
//		System.out.println(entityClass.getName());
//		System.out.println(entityClass.getSimpleName());
////		System.out.println(entityClass.getTypeName());
//		System.out.println(entityClass.getCanonicalName());
		
		this.tableName = this.entityClass.getSimpleName();
	}

	@Override
	public T get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> findAll() {
		// TODO Auto-generated method stub
		System.out.println("Service.findAll()");
		MapperParameter parameter = new MapperParameter();
		parameter.setTableName(tableName);
		return this.genericMapper.findAll(parameter);
	}
	

	@Autowired
	private GenericMapper<T> genericMapper;
	
}	
