package com.sysone.prueba_ingreso.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sysone.prueba_ingreso.controller.request.CompressRequest;
import com.sysone.prueba_ingreso.controller.response.CompressResponse;
import com.sysone.prueba_ingreso.service.CompressService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class CompressController {
	
	private CompressService compressService;

	public CompressController(CompressService compressService) {
		this.compressService = compressService;
	}

    @RequestMapping(path = "/compress/", method = RequestMethod.POST)
    public ResponseEntity<?> postCompress(@RequestBody CompressRequest request) {
    	try {
    		String compressedValue = this.compressService.compress(request.getValue());
    		return ResponseEntity.ok(new CompressResponse(compressedValue));
    	}
    	catch (Exception e) {
    		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    	}    		
    }
    
    @RequestMapping(path = "/candidate/", method = RequestMethod.GET)
    public ResponseEntity<?> getCandidate() {
    	return ResponseEntity.ok("Abel Espínola");
    }

}
