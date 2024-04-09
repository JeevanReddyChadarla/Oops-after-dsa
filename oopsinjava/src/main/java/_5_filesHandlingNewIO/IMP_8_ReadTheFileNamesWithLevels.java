package _5_filesHandlingNewIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//print all the file names with levels, 
// folder is represented by "."

public class IMP_8_ReadTheFileNamesWithLevels {

	public static void main(String[] args) throws IOException {
		// walk - accepts two parameters - 
		// path and the number of levels to go deep inside folder
		Files.walk(Paths.get("."), 3).forEach(System.out::println);
		
		// filter out all the java files
		Files.walk(Paths.get("."), 5)
								.filter(path->String.valueOf(path).contains(".java"))
								.forEach(System.out::println);
	}

}
