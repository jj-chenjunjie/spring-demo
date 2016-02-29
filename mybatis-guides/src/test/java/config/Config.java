package config;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("example.mybatis")
@MapperScan("example.mybatis.mapper")
@EnableAutoConfiguration
public class Config {
	
//	@Bean
	public DataSource dataSource() {
		DataSource dataSource = new PooledDataSource("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/world", "root", "1234");
		return dataSource;
	}
	
}
