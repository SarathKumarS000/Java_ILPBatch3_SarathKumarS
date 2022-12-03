package com.experion.entity;

import com.experion.exceptions.TshirtException;

public class Tshirt extends Fabric{

	public Tshirt(String fabricType) {
		super(fabricType);
	}
	
	public void washTshirt (Fabric fabric) throws TshirtException {
		if (fabric.getFabricType() == "Cotton")
			System.out.println("Washing T-Shirt");
		else
			throw new TshirtException();
	}
	

	
}
