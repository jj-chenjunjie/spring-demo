package example.world.services.impl.mybatis;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import example.world.domain.City;

public class GenericService<T> implements Service<T> {
	
//	@Autowired
//	private SqlSessionFactory sqlSessionFactory;

//	private Mapper<T> mapper;
	
	public GenericService() {
//		PooledDataSource dataSource = new PooledDataSource("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/world", "root", "1234");
//		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//		sqlSessionFactoryBean.setDataSource(dataSource);
//		sqlSessionFactoryBean.setTypeAliasesPackage("example.world.domain");
//		sqlSessionFactory = sqlSessionFactoryBean.getObject();
		
//		ParameterizedType genericSuperclass = (ParameterizedType) this.getClass().getGenericSuperclass();
//		System.out.println(genericSuperclass);
		Type genericSuperclass = getClass().getGenericSuperclass();
		Type[] actualTypeArguments = ((ParameterizedType)genericSuperclass).getActualTypeArguments();
		Class<T> tClass = (Class<T>) actualTypeArguments[0];
//		System.out.println(tClass);
		// TODO Auto-generated constructor stub
//		mapper = sqlSessionFactory.openSession();
	}
	
	
	public static void main(String[] args) throws Exception {
		GenericService<City> service = new GenericService<City>();
//		service.get(1);
	}


	@Override
	public T get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
