package com.demo.positioncache.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.demo.positioncache.bean.Position;

@Service
public class PositionCacheService {

	Map<String, Position> positionCache = initCache();
	
	private Map<String, Position> initCache() {
		
		HashMap<String, Position> positionCache = new HashMap<String, Position>();
		
		positionCache.put("Account1_Cusip1", new Position("Account1", "Cusip1", new BigDecimal(100)));
		positionCache.put("Account2_Cusip1", new Position("Account2", "Cusip1", new BigDecimal(50)));
		positionCache.put("Account3_Cusip2", new Position("Account3", "Cusip2", new BigDecimal(200)));
		
		return positionCache;
	}

	public int getCacheSize() {
		return this.positionCache.size();
	}
	
	public Position getPosition(String account_cusip){
		return positionCache.get(account_cusip);
	}

	public void addPosition(Position position)  {
		String acocunt_cusip = position.getAccount()+"_"+position.getCuisp();
		positionCache.put(acocunt_cusip, position);
	}

	public void invalidateCache() {
		positionCache.clear();
	}
	
}
