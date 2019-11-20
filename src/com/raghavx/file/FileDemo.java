package com.raghavx.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
/**
 * Print the directory in which xyz.txt exists 
 * Print the content of above directory 
 * Call all the methods of the File class 
 * @param args
 * @throws IOException
 */
	public static void main(String[] args) throws IOException {
		File f = new File("xyz.txt");
		System.out.println("Exists = "+f.exists());
		if(!f.exists()) {
			boolean created = f.createNewFile();
			System.out.println("Created = "+created);
		}
		System.out.println("Path = "+f.getAbsolutePath());
		System.out.println("Directory = "+f.isDirectory());
	}

}
