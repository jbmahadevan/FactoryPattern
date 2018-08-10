package com.java8.stream.sample;

public class FactoryDemo {
	public static void main(String[] args) {
		 ParserFactory parserfactory = new ParserFactory();
		 AttachmentTypeParser mapdf = parserfactory.parseDocument("PDF") ;
		 mapdf.parseDocument();
		 AttachmentTypeParser tiff = parserfactory.parseDocument("TIFF") ;
		 tiff.parseDocument();
		 AttachmentTypeParser jpeg = parserfactory.parseDocument("JPEG") ;
		 jpeg.parseDocument();
	}
}