package _5_filesHandlingNewIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Syntax to create directory - 
//Path p = Paths.get("DataSet/poem.txt");
//Path createNewPath  = Files.createFile(p);

public class File_2_Create_File {

	public static void main(String[] args) {
		try {
			Path p = Paths.get("DataSet/poem.txt");
			if(Files.exists(p)) {
				System.out.println("File is already present");
			}else {
				Path createNewPath  = Files.createFile(p);
				System.out.println("File is created at "+createNewPath);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
