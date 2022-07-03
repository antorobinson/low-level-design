package com.anto.hfooad.instrument.enums;

import lombok.Getter;

@Getter
public enum Builder {

	FENDER("Fender"), MARTIN("Martin"), GIBSON("Gibson"), COLLINGS("Collings"), OLSON("Olson"), RYAN("Ryan"), PRS("PRS"), ANY("PRS");
	
	String value;
	
	Builder(String value){
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
