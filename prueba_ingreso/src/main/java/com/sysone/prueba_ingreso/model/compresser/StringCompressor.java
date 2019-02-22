package com.sysone.prueba_ingreso.model.compresser;

import com.sysone.prueba_ingreso.model.comparator.CaseInsensitiveCharacterComparator;
import com.sysone.prueba_ingreso.model.compresser.exception.CannotCompressException;

public class StringCompressor implements Compressor<String> {

	/* (non-Javadoc)
	 * @see com.sysone.prueba_ingreso.model.compresser.Compresser#compress(java.lang.Object)
	 */
	@Override
	public String compress(String value) {
		if (value == null)
			throw new CannotCompressException("Cannot compress given null String");
		
		CharactersCounter characterCounter = new CharactersCounter(new CaseInsensitiveCharacterComparator());
		
		for (Character c : value.toCharArray())
			characterCounter.add(c);
		
		return characterCounter.getResult();
	}
	
}
