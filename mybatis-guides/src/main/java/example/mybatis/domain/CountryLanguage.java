package example.mybatis.domain;

public class CountryLanguage {
	
	private Country country;
	private String language;
	private String countryCode;
	
	public CountryLanguage() {
		// TODO Auto-generated constructor stub
	}
	
	public CountryLanguage(String countryCode){
		super();
		this.countryCode = countryCode;
	}
	
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	
}
