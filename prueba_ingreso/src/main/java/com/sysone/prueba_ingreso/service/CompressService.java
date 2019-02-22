package com.sysone.prueba_ingreso.service;

import org.springframework.stereotype.Service;

import com.sysone.prueba_ingreso.model.compresser.Compressor;
import com.sysone.prueba_ingreso.model.compresser.StringCompressor;

@Service
public class CompressService {

	public String compress(String value) {
		Compressor<String> compresser = new StringCompressor();
		return compresser.compress(value);
	}

}
