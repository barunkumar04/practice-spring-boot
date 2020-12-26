package com.demo.positioncache;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.positioncache.service.PositionCacheService;

@SpringBootTest
class PositionCacheApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testInitialCacheSize() {
		
		PositionCacheService positionCacheService = new PositionCacheService();
		assertTrue(positionCacheService.getCacheSize() == 3);
	
	}
}
