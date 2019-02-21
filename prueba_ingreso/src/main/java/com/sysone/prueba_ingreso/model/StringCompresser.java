package com.sysone.prueba_ingreso.model;

import com.sysone.prueba_ingreso.model.exception.CannotCompressException;

public class StringCompresser implements Compresser<String> {

	@Override
	public String compress(String value) {
		if (value == null)
			throw new CannotCompressException();
		
		if (value.isEmpty())
			return "";
		
		String upperCaseValue = value.toUpperCase();
		StringBuilder compressedStringBuilder = new StringBuilder(); 
		
		Character previous = null;
		Integer count = 0;
		
		for (Character current: upperCaseValue.toCharArray()) {
			
			if (current.equals(previous) || previous == null)
				count++;
			else {
				compressedStringBuilder.append(count).append(previous);
				count = 1;
			}
			previous = current;			
		}
		compressedStringBuilder.append(count).append(previous);
		
		return compressedStringBuilder.toString();
	}

}
