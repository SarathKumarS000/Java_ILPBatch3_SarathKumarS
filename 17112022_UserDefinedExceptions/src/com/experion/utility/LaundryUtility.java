package com.experion.utility;

import com.experion.entity.Fabric;
import com.experion.entity.Tshirt;
import com.experion.exceptions.TshirtException;

public class LaundryUtility {

	public static void main(String[] args) {

		Fabric fabric = new Tshirt("Silk");
		try {
			fabric.washTshirt(fabric);
		} catch (TshirtException e) {
			System.out.println(e.getMessage());
		}
	}

}
