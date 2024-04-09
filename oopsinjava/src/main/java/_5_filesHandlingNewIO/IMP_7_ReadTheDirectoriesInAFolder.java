package _5_filesHandlingNewIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//print all the folder names, folder is represented by "."

public class IMP_7_ReadTheDirectoriesInAFolder {

	public static void main(String[] args) throws IOException {
		Files.list(Paths.get(".")).forEach(System.out::println);
	}

}
