package com.sysone.prueba_ingreso.model.comparator;

public class CaseInsensitiveCharacterComparator implements Comparator {

	@Override
	public boolean matches(Character char1, Character char2) {
		return Character.toUpperCase(char1) == Character.toUpperCase(char2);
	}

}
