package _5_filesHandlingNewIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File_4_WritingToAFile {
// we can write data in two formates - 1. byte type and 2. char type
	public static void main(String[] args) {
		try {
			Path p = Paths.get("DataSet/newfile.txt");
			Path file = Files.createFile(p);
			String content = "I love csk to play with dhoni";
			Files.write(file, content.getBytes());
			System.out.println("Data written to the destination file");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
