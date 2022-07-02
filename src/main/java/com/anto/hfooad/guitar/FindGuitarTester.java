package com.anto.hfooad.guitar;

import java.util.List;

import com.anto.hfooad.guitar.model.Builder;
import com.anto.hfooad.guitar.model.Guitar;
import com.anto.hfooad.guitar.model.GuitarSpec;
import com.anto.hfooad.guitar.model.Inventory;
import com.anto.hfooad.guitar.model.Type;
import com.anto.hfooad.guitar.model.Wood;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec searchGuitar = new GuitarSpec(Builder.FENDER, "startocoaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 2);
		List<Guitar> guitars = inventory.search(searchGuitar);
		
		if(guitars.isEmpty()){
			System.out.println("Sorry! we did not find any with your preference");
		}else{
			for(Guitar g : guitars){
				System.out.println("We found one: \n"+ g);
				System.out.println("----------------------");
			}
		}
	}
	
	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("V1234", 12.3, Builder.FENDER, "startocoaster", Type.ELECTRIC,  Wood.ALDER, Wood.ALDER, 2);
		inventory.addGuitar("V1256", 18.5, Builder.GIBSON, "hello", Type.ACOUSTIC,  Wood.ALDER, Wood.ALDER, 3);
		inventory.addGuitar("V1278", 14, Builder.MARTIN, "hi", Type.ELECTRIC,  Wood.ALDER, Wood.ALDER, 5);
	}

}
