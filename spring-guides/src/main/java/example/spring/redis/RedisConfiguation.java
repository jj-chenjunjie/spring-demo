package example.spring.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import redis.clients.jedis.JedisShardInfo;

@Configuration
public class RedisConfiguation {
	
	@Bean
	public RedisTemplate<Object, Object> redisTemplate(){

		System.out.println("RedisConfiguation.redisTemplate()");
		JedisConnectionFactory factory = new JedisConnectionFactory();
		JedisShardInfo shardInfo = new JedisShardInfo("localhost", 6379);
		factory.setShardInfo(shardInfo);
		RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(factory);
		return redisTemplate;
		
	}
	
}
