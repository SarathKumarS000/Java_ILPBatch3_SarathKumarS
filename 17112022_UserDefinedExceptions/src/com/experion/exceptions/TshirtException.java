package com.experion.exceptions;

public class TshirtException extends Exception{

	@Override
	public String getMessage() {
		return "Tshirt Exception because material is not cotton";
	}

	
}
