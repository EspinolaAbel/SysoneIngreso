package com.sysone.prueba_ingreso.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sysone.prueba_ingreso.model.exception.CannotCompressException;

public class CompressServiceTest {
	
	private CompressService service;

	@Before
	public void setUp() {
		this.service = new CompressService();
	}

	@Test
	public void given_a_string_with_upppercase_characters_when_compressing_should_return_the_compressed_string() {
		final String STRING_TO_COMPRESS = "AAABBAAAAABBBCCCCCCCCAAAAA";
		
		String compressedStringResult = this.service.compress(STRING_TO_COMPRESS);
		
		assertEquals("3A2B5A3B8C5A", compressedStringResult);		
	}
	
	@Test
	public void given_an_empty_string_when_compressing_should_return_an_empty_string() {
		final String EMPTY_STRING_TO_COMPRESS = "";
		
		String compressedStringResult = this.service.compress(EMPTY_STRING_TO_COMPRESS);
		
		assertEquals("", compressedStringResult);		
	}
	
	@Test(expected=CannotCompressException.class)
	public void given_a_null_string_when_compressing_should_throw_CannotCompressException() {
		this.service.compress(null);
	}

}
