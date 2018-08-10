package com.java8.stream.sample;

public class ParserFactory  {
	public  AttachmentTypeParser parseDocument(String documentType) {
		 if ("PDF".equalsIgnoreCase(documentType)) {
			return new AttachmentPdf() ;
		 }
		 if ("Tiff".equalsIgnoreCase(documentType)) {
				return new AttachmentTiff() ;
			 }
		 if ("JPEG".equalsIgnoreCase(documentType)) {
				return new AttachmentJPEG() ;
			 }
			 return null;
	}

}
