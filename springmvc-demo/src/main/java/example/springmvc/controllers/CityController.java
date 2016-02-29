package example.springmvc.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.world.domain.City;
import example.world.mapper.CityMapper;

//@RestController
//@RequestMapping("cities")
public class CityController extends BaseController<City, CityMapper>{
	
	@RequestMapping("{id}")
	City get(@PathVariable int id){
		System.out.println("CityController.get()");
//		return service.get(id);
		return null;
	}
	
}
