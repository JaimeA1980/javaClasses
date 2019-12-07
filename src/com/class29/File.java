package com.class29;

public abstract class File {
	public abstract void open();
		
	public void edit() {
		System.out.println("This edits the file");
	}
	public void close() {
		System.out.println("This closes the file");
		
	}
}
class JavaFile extends File{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("To open .java file, we need notepad++");
		
	}
	
}
class WordFile extends File{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("To open .doc file, we need Microsoft Office Word");
	}
	
}
class PDFFile extends File{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("To open .pdf file, we need Adobe");
	}
}