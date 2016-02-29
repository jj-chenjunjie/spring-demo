package example.spring.scheduling;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定义计划任务类
 * @author 俊杰
 *
 */
@Component
public class ScheduledTask {
	
	private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedDelay = 1000)
	public void reportCurrentTime() {
		System.out.println("the time is now " + SIMPLE_DATE_FORMAT.format(new Date()));
	}
	
}
