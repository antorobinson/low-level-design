package com.anto.hfooad.instrument.enums;

import lombok.Getter;

@Getter
public enum Type {

	ACOUSTIC("Acoustic"), ELECTRIC("Electric");
	
	String value;
	
	Type(String value){
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
