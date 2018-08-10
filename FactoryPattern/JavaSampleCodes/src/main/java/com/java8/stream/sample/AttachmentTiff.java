package com.java8.stream.sample;

public class AttachmentTiff  implements AttachmentTypeParser {

	@Override
	public void parseDocument( ) {
		System.out.println("Parsing TIFF") ;
		
	}
}
