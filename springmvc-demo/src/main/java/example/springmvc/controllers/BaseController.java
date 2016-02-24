package example.springmvc.controllers;

import example.world.services.impl.mybatis.Service;

public class BaseController<T, M> {
	
	protected Service<T, M> service = new Service<>();

}
