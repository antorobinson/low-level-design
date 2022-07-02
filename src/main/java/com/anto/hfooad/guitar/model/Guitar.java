package com.anto.hfooad.guitar.model;

import lombok.Data;

@Data
public class Guitar {

	private String serialnumber;
	private double price;
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	
	public Guitar(String serialnumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		super();
		this.serialnumber = serialnumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
}
