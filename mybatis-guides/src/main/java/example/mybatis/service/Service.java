package example.mybatis.service;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import example.mybatis.mapper.GenericMapper;
import example.mybatis.mapper.Mapper;

public class Service<T> implements Mapper<T>{
	
	private Class<T> entityClass;
	
	private String tableName;
	
	public Service() {
		Type genType = this.getClass().getGenericSuperclass();  
        Type[] params = ((ParameterizedType)genType).getActualTypeArguments(); 
        entityClass = (Class) params[0]; 
		System.out.println("Service.Service()");
		System.out.println(entityClass.getName());
		System.out.println(entityClass.getSimpleName());
		System.out.println(entityClass.getTypeName());
		System.out.println(entityClass.getCanonicalName());
		
		this.tableName = this.entityClass.getSimpleName();
	}

	@Override
	public T get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return this.genericMapper.findAll(tableName);
	}

	@Autowired
	private GenericMapper<T> genericMapper;
	
}	
