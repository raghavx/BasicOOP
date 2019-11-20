package com.raghavx.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataDemo {
/**
 * Find the difference b/w Append & Flush 
 * @param args
 * @throws IOException
 */
	public static void main(String[] args) throws IOException {
		File f = new File("xyz.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("This is a data I want to write.");
		fw.write("This is a data I want to write  1 .");
		fw.write("This is a data I want to write 2 .");
		fw.flush();
		fw.close();
	}

}
