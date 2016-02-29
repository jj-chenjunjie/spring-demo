package example.mybatis.domain;

import java.util.List;

public class Country {
	private String code;
	private String name;
	
	private List<City> cities;
	
	public Country() {
		// TODO Auto-generated constructor stub
	}
	
	public Country(String code) {
		super();
		this.code = code;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
}
