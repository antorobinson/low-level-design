package com.anto.hfooad.guitar.enums;

import lombok.Getter;

@Getter
public enum Wood {

	INDIAN_OSEWOOD("Indian Rosewood"), BRAZILIAN_ROSEWOOD("Brazilian Rosewood"), MABOGANY("Mabogany"), MAPLE("Maple"),
	COCOBOLO("Cocobolo"), CEDAR("Cedar"), ADIRONDACK("Adirondack"), ALDER("Alder"), SITKA("Sitka");

	String value;

	Wood(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
