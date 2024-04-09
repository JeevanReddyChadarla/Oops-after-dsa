package _5_filesHandlingNewIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class IMP_9_ReadTheContentFromAFile {

	public static void main(String[] args) throws IOException {
		Path pathOfTheFile = Paths.get("C:\\Users\\HP\\Desktop\\Oops-after-dsa\\oopsinjava\\src\\main\\java\\_5_filesHandlingNewIO\\README.md");
		List<String>lines = Files.readAllLines(pathOfTheFile);
		// the above line will read "all the content in the file at once"
		System.out.println(lines);
		
		Files.lines(pathOfTheFile).forEach(System.out::println);
		// the above line will "only read lines"
	}

}
