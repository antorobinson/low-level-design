package com.anto.hfooad.guitar.model;

import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialnumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		
		Guitar guitar = new Guitar(serialnumber, price, builder, model, type, backWood, topWood);
		guitars.add(guitar);

	}

	public Guitar getGuitar(String serialNumber) {
		for(Guitar g : guitars) {
			if(g.getSerialnumber().equals(serialNumber)) return g;
		}
		return null;
	}

	public Guitar search(Guitar searchGuitar) {
		
		for(Guitar g : guitars) {
			Builder builder = searchGuitar.getBuilder();
			if(builder != null && !builder.equals(g.getBuilder())) continue;
			
			String model = searchGuitar.getModel();
			if(model != null && !model.equals(g.getModel())) continue;
			
			Type type = searchGuitar.getType();
			if(type != null && !type.equals(g.getType())) continue;
			
			Wood backWood = searchGuitar.getBackWood();
			if(backWood !=  null && !backWood.equals(g.getBackWood())) continue;
			
			Wood topWood = searchGuitar.getTopWood();
			if(topWood != null && !topWood.equals(g.getTopWood())) continue;
			
			return g;
		}
		
		return null;
	}

}
