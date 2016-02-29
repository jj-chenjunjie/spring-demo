package example.spring.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import example.spring.domain.Person;

@Component
public class RedisRunner implements CommandLineRunner {
	
	@Autowired
	private RedisTemplate<Object, Object> redisTemplate;

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("RedisRunner.run()");
		redisTemplate.execute(new RedisCallback<Object>() {

			@Override
			public Object doInRedis(RedisConnection connection) throws DataAccessException {
				// TODO Auto-generated method stub
				byte[] bs = connection.get("foo".getBytes());
				Person person = new Person();
				person.setAge(22);
				person.setName("chen");
//				redisTemplate.getHashValueSerializer().serialize(person);
				System.out.println(new String(bs));
				return null;
			}
		});
		
	}

}
