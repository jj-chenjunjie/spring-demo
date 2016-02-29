package example.world.services.impl.mybatis;

import example.world.domain.City;
import example.world.mapper.CityMapper;

public class CityService extends GenericService<City>{
	
	public CityService() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	private CityMapper cityMapper;
	
}
