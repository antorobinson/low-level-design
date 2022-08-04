package com.anto.hfooad.instrument;

import java.util.List;

import com.anto.hfooad.instrument.enums.Builder;
import com.anto.hfooad.instrument.enums.Type;
import com.anto.hfooad.instrument.enums.Wood;
import com.anto.hfooad.instrument.model.GuitarSpec;
import com.anto.hfooad.instrument.model.Instrument;
import com.anto.hfooad.instrument.model.Inventory;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec searchGuitar = new GuitarSpec(Builder.FENDER, "startocoaster", Type.ELECTRIC, Wood.ALDER, Wood.ALDER,
				2);
		List<Instrument> instruments = inventory.search(searchGuitar);

		if (instruments.isEmpty()) {
			System.out.println("Sorry! we did not find any with your preference");
		} else {
			for (Instrument instrument : instruments) {
				System.out.println("We found "+instruments.size()+"\n" + instrument.toString());
				System.out.println("----------------------");
			}
		}
	}

	private static void initializeInventory(Inventory inventory) {

		GuitarSpec guitarSpec1 = new GuitarSpec(Builder.FENDER, "startocoaster", Type.ELECTRIC,  Wood.ALDER, Wood.ALDER, 2);
		GuitarSpec guitarSpec2 = new GuitarSpec(Builder.COLLINGS, "startocoaster", Type.ACOUSTIC,  Wood.ALDER, Wood.ALDER, 2);
		GuitarSpec guitarSpec3 = new GuitarSpec(Builder.GIBSON, "startocoaster", Type.ELECTRIC,  Wood.ALDER, Wood.ALDER, 2);

		inventory.addInstrument("V1234", 12.3, guitarSpec1 );
		inventory.addInstrument("V1256", 15, guitarSpec2 );
		inventory.addInstrument("V8934", 19, guitarSpec3 );
	}

}
