package com.anto.hfooad.guitar;

import com.anto.hfooad.guitar.model.Builder;
import com.anto.hfooad.guitar.model.Guitar;
import com.anto.hfooad.guitar.model.Inventory;
import com.anto.hfooad.guitar.model.Type;
import com.anto.hfooad.guitar.model.Wood;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar searchGuitar = new Guitar("", 0, Builder.FENDER, "startocoaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		Guitar guitar = inventory.search(searchGuitar);
		
		if(guitar != null) {
			System.out.println("We found one: \n"+ guitar);
		}else {
			System.out.println("Sorry! we did not find any with your preference");
		}

	}
	
	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("V1234", 12.3, Builder.FENDER, "startocoaster", Type.ELECTRIC,  Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V1256", 18.5, Builder.GIBSON, "hello", Type.ACOUSTIC,  Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("V1278", 14, Builder.MARTIN, "hi", Type.ELECTRIC,  Wood.ALDER, Wood.ALDER);
	}

}
