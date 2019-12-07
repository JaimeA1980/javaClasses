package com.class29;

public class FileTest {
	
	public static void main(String[] args) {
		File file = new JavaFile();
		file.open();
		
		File file2 = new WordFile();
		file2.open();
		
		File file3 = new PDFFile();
		file3.open();
	}

}
