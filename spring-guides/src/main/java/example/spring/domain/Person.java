package example.spring.domain;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person implements Serializable {
	
	@Size(min = 2, max = 30, message="名字长度限制2-30个字符")
	private String name;
	
	@NotNull(message="年龄不能为空")
	@Min(value=18, message="未满18岁")
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
}
