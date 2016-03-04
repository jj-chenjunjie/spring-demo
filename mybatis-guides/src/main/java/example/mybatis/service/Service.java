package example.mybatis.service;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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

	@Resource(name="genericMapper")
	private GenericMapper<T> genericMapper;


	@Override
	public List<T> list() {
		System.out.println("Service.list()");
		
		return this.genericMapper.findAll(tableName);
	}

	@Override
	public List<Map<String, Object>> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}	
