package com.anto.hfooad.guitar.model;

import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Instrument> instruments;

	public Inventory() {
		instruments = new LinkedList<>();
	}

	public void addInstrument(String serialnumber, double price, InstrumentSpec instrumentSpec) {
		Instrument instrument = null;
		if (instrumentSpec instanceof GuitarSpec) {
			instrument = new Guitar(serialnumber, price, (GuitarSpec) instrumentSpec);
		} else if (instrumentSpec instanceof MandolinSpec) {
			instrument = new Mandolin(serialnumber, price, (MandolinSpec) instrumentSpec);
		}
		instruments.add(instrument);

	}

	public Instrument getGuitar(String serialNumber) {
		for (Instrument instrument : instruments) {
			if (instrument.getSerialnumber().equals(serialNumber))
				return instrument;
		}
		return null;
	}

	public List<Instrument> search(InstrumentSpec searchInstrumentSpec) {

		List<Instrument> matchedGuitars = new LinkedList<>();

		for (Instrument instrument : instruments) {
			if (instrument.getSpec().matches(searchInstrumentSpec)) {
				matchedGuitars.add(instrument);
			}
		}
		return matchedGuitars;
	}

}
