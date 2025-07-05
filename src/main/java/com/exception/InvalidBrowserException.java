package com.exception;

public class InvalidBrowserException extends RuntimeException {
   private String browsername;
	public InvalidBrowserException(String browsername) {
		this.browsername=browsername;
	}
	
	@Override
		public String toString() {
			
			return ("Invalid Browser Name"+browsername);
		}
	
}
