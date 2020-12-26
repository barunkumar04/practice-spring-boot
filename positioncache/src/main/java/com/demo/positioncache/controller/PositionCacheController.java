package com.demo.positioncache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.positioncache.bean.Position;
import com.demo.positioncache.service.PositionCacheService;

@RestController
public class PositionCacheController {
	@Autowired
	private PositionCacheService positionCacheService;
	
	@RequestMapping("/cacheSize")
	public int getCacheSize() {
		return positionCacheService.getCacheSize();
	}
	
	@RequestMapping("/positions/{key}")
	public Position getPosition(@PathVariable String key) {
		return positionCacheService.getPosition(key);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/positions")
	public void addPosition(@RequestBody Position position) {
		positionCacheService.addPosition(position);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/positions/{key}")
	public void updatePosition(@RequestBody Position position, @PathVariable String key) {
		positionCacheService.addPosition(position);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/positions/invalidate")
	public void invalidate() {
		positionCacheService.invalidateCache();
	}
}
