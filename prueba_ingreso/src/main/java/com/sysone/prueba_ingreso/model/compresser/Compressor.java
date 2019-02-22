package com.sysone.prueba_ingreso.model.compresser;

public interface Compressor<T> {

	/**
	 * Given a value returns its compressed version
	 * @param value - value to compress
	 * @return compressed value
	 */
	public T compress(T value);

}
