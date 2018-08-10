package com.java8.stream.sample;

public class AttachmentJPEG implements AttachmentTypeParser {
	@Override
	public void parseDocument( ) {
		System.out.println("Parsing JPEG") ;
		
	}
}
