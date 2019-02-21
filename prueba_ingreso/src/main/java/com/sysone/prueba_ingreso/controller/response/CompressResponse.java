package com.sysone.prueba_ingreso.controller.response;

public class CompressResponse {
	
	public String compressed;


	public CompressResponse() { }

	public CompressResponse(String compressed) {
		this.compressed = compressed;
	}

	public String getCompressed() {
		return compressed;
	}

	public void setCompressed(String compressed) {
		this.compressed = compressed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((compressed == null) ? 0 : compressed.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompressResponse other = (CompressResponse) obj;
		if (compressed == null) {
			if (other.compressed != null)
				return false;
		} else if (!compressed.equals(other.compressed))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CompressResponse [compressed=" + compressed + "]";
	}

}
