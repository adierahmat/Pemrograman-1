package belajar.exception;

import java.io.File;

public class FileManager{
	private FileReader file;
	
	public void buka(String namafile){
		file = new FileReader namafile; 
	}
}
