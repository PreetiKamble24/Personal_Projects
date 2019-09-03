package iooperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {

	File f;

	public ReadWrite(File f) {
		this.f = new File("f1.txt");
	}
	
	public void toRead() throws IOException {
		FileReader fr=new FileReader(f);
		int ch=fr.read();
		while(ch!= -1){
			System.out.println((char)ch);
			ch=fr.read();
		}
	}
	
	public void toWrite() throws IOException{
	FileWriter fw=new FileWriter(f);
	fw.write("Welcome to Java Training");
	fw.close();
	}
}
