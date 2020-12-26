package com.demo.positioncache.bean;

import java.math.BigDecimal;

public class Position {
	private String account;
	private String cuisp;
	private BigDecimal quantity;
	
	
	public Position(String account, String cuisp, BigDecimal quantity) {
		super();
		this.account = account;
		this.cuisp = cuisp;
		this.quantity = quantity;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getCuisp() {
		return cuisp;
	}
	public void setCuisp(String cuisp) {
		this.cuisp = cuisp;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((cuisp == null) ? 0 : cuisp.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (cuisp == null) {
			if (other.cuisp != null)
				return false;
		} else if (!cuisp.equals(other.cuisp))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}
}
