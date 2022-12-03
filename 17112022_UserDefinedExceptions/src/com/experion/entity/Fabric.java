package com.experion.entity;

import com.experion.exceptions.TshirtException;

public class Fabric {

	String fabricType;

	public Fabric(String fabricType) {
		super();
		this.fabricType = fabricType;
	}

	public String getFabricType() {
		return fabricType;
	}

	public void setFabricType(String fabricType) {
		this.fabricType = fabricType;
	}
	public void washTshirt(Fabric fabric) throws TshirtException {
		
	}
}
