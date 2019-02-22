package com.sysone.prueba_ingreso.model.compresser.exception;

public class CannotCompressException extends RuntimeException {

	private static final long serialVersionUID = -2042177196912659667L;
	
	public CannotCompressException() {
		super();
	}
	
	public CannotCompressException(String message) {
		super(message);
	}

}
