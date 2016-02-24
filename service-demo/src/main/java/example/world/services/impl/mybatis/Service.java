package example.world.services.impl.mybatis;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import example.world.domain.City;
import example.world.mapper.CityMapper;
import example.world.mapper.Mapper;

public class Service<T, M> {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	private Mapper<T> mapper;
	
	public Service() throws Exception {
		PooledDataSource dataSource = new PooledDataSource("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/world", "root", "1234");
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		sqlSessionFactoryBean.setTypeAliasesPackage("example.world.domain");
		sqlSessionFactory = sqlSessionFactoryBean.getObject();
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		Type[] actualTypeArguments = type.getActualTypeArguments();
		for (Type tp : actualTypeArguments) {
			System.out.println(tp.getClass().getName());
		}
		System.out.println("Service.Service()");
		// TODO Auto-generated constructor stub
//		mapper = sqlSessionFactory.openSession();
	}
	
  	public T get(int id) {
		
		/*return mapper.get(id);*/
		System.out.println("Service.get()");
		return null;
	}
	
	public static void main(String[] args) throws Exception {
		Service<City, CityMapper> service = new Service<>();
		service.get(1);
	}
	
}
