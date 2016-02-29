package test;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.Config;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes={Config.class})
public class JdbcTest {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;
	
	
	@Test
	public void test() {
		System.out.println("JdbcTest.test()");
	}

	@Autowired
	private DataSource dataSource;
	
}
