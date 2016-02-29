package example.world.services.impl.mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.jdbc.core.JdbcTemplate;

import example.world.domain.City;

public class GeneralService<T> implements Service<T>{
	
	private Class<T> entity;
	
	private JdbcTemplate jdbcTemplate;
	
	public GeneralService(Class<T> entity) {
		// TODO Auto-generated constructor stub
		this.entity = entity;
		
		PooledDataSource dataSource = new PooledDataSource("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/world", "root", "1234");
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		sqlSessionFactoryBean.setTypeAliasesPackage("example.world.domain");
		SqlSessionFactory sqlSessionFactory = null;
		try {
			sqlSessionFactory = sqlSessionFactoryBean.getObject();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSession session = sqlSessionFactory.openSession();
		
//		this.jdbcTemplate = new JdbcTemplate(dataSource);
//		
//		List<Map<String, Object>> queryForList = this.jdbcTemplate.queryForList("select * from city");
//		List<City> queryForList2 = this.jdbcTemplate.queryForList("select * from city", City.class);
//		System.out.println(queryForList.size());
//		System.out.println(queryForList2.size());
		
	}

	@Override
	public T get(int id) {
		// TODO Auto-generated method stub
//		this.jdbcTemplate.queryForObject("select * from city where ", requiredType)
		return null;
	}
	
	public static void main(String[] args) {
		GeneralService<City> generalService = new GeneralService<>(City.class);
		
		
	}

}
