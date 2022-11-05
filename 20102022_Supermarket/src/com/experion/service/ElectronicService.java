package com.experion.service;

import java.util.Date;

public interface ElectronicService {
	
	public abstract void ProductRepair();

	public abstract void warrantyReplacement(Date warrantyDate, Date currentDate);
	

}
