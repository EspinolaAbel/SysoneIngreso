package com.sysone.prueba_ingreso.service;

import org.springframework.stereotype.Service;

import com.sysone.prueba_ingreso.model.Compresser;
import com.sysone.prueba_ingreso.model.StringCompresser;

@Service
public class CompressService {

	public String compress(String value) {
		Compresser<String> compresser = new StringCompresser();
		return compresser.compress(value);
	}

}
