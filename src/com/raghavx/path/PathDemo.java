package com.raghavx.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class PathDemo {

	public static void main(String[] args) throws IOException {
		// Normalize a path
		Path file = Paths.get("/Users/raghav/sts-train/BasicOOP/xyz.txt");
		Path target = Paths.get("/Users/raghav/sts-train/BasicOOP/xyz_cp.txt");

		Path target_mv = Paths.get("/Users/raghav/sts-train/BasicOOP/xyz_mv.txt");
		Path directory = Paths.get("/Users/raghav/sts-train/BasicOOP");
		System.out.println(Files.isDirectory(directory));
		System.out.println(Files.isSameFile(file, directory));
		Files.copy(file, target, StandardCopyOption.REPLACE_EXISTING);
		Files.move(file, target_mv, StandardCopyOption.REPLACE_EXISTING);
		Files.move(target_mv, file, StandardCopyOption.REPLACE_EXISTING);
		List<String> lines = Files.readAllLines(file);
		//
		for (int i = 0; i < lines.size(); i++) {
			System.out.println(lines.get(i));
		}
		// for each
		System.out.println("--- using enhanced for loop  --- ");
		for (String str : lines) {
			System.out.println(str);
		}
		// lambda
		System.out.println("--- using lamda --- ");
		lines.forEach(System.out::println);
		lines.forEach(str -> {
			System.out.println(str);
		});
		// parallel stream

		System.out.println("--- using lamda --- parallel stream  ");
		lines.parallelStream().forEach(System.out::println);
		lines.parallelStream().forEach(str -> {
			System.out.println(str);
		});
	}

}
