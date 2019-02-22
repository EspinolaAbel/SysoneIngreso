package com.sysone.prueba_ingreso.model.compresser;

import com.sysone.prueba_ingreso.model.comparator.Comparator;

public class CharactersCounter {
	
	private Integer appearences;
	private Character character;
	private StringBuilder stringBuilder;
	private Comparator charactersComparator;
	
	/**
	 * @param comparator
	 */
	public CharactersCounter(Comparator comparator) {
		this.character = null;
		this.appearences = 0;
		this.stringBuilder = new StringBuilder();
		this.charactersComparator = comparator;
	}
	
	/**
	 * Receives a new character and comprise it
	 * @param characterToCount
	 */
	public void add(Character characterToCount) {
		if (this.character == null) {
			this.countNewCharacter(characterToCount);
			return;
		}
		else if (this.charactersComparator.matches(this.character, characterToCount)) {
			this.increaseCount();
		}
		else {
			this.countNewCharacter(characterToCount);
		}				
	}
	
	private void countNewCharacter(Character c) {
		if (this.character != null)
			this.stringBuilder.append(this.appearences).append(this.character);
		this.character = c;
		this.appearences = 1;
	}
	
	private void increaseCount() {
		this.appearences++;
	}
	
	/**
	 * @return a resulting string compressed value
	 */
	public String getResult() {
		if (this.character == null)
			return "";
		String result = this.stringBuilder.toString() + this.appearences + this.character;
		return result;
	}
	
}
