package com.raghavx.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathDemo {

	public static void main(String[] args) throws IOException {
		// Normalize a path 
		Path file = Paths.get("/Users/raghav/sts-train/BasicOOP/xyz.txt");
		Path target = Paths.get("/Users/raghav/sts-train/BasicOOP/xyz_cp.txt");

		Path target_mv = Paths.get("/Users/raghav/sts-train/BasicOOP/xyz_mv.txt");
		Path directory = Paths.get("/Users/raghav/sts-train/BasicOOP");
		System.out.println(Files.isDirectory(directory));
		System.out.println(Files.isSameFile(file,directory));
		Files.copy(file, target, StandardCopyOption.REPLACE_EXISTING);
		Files.move(file, target_mv, StandardCopyOption.REPLACE_EXISTING);
		
	}

}
