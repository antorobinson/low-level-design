package com.anto.hfooad.guitar.model;

import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialnumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood, Integer numStrings) {
		
		GuitarSpec guitarSpec = new GuitarSpec(builder, model, type, backWood, topWood, numStrings);
		Guitar guitar = new Guitar(serialnumber, price, guitarSpec);
		guitars.add(guitar);

	}

	public Guitar getGuitar(String serialNumber) {
		for(Guitar g : guitars) {
			if(g.getSerialnumber().equals(serialNumber)) return g;
		}
		return null;
	}

	public List<Guitar> search(GuitarSpec searchGuitar) {
		
		List<Guitar> matchedGuitars = new LinkedList<>();
		
		for(Guitar guitar : guitars) {
			if(guitar.getGuitarSpec().matches(searchGuitar)){
				matchedGuitars.add(guitar);
			}
		}
		return matchedGuitars;
	}

}
