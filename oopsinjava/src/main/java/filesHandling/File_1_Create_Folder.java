package filesHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Syntax to create directory - 
//Path p = Paths.get("DataSet");
//Path createNewPath = Files.createDirectories(p);

public class File_1_Create_Folder {

	public static void main(String[] args) {
		try {
			Path p = Paths.get("DataSet");
			if(Files.exists(p)) {
				System.out.println("Directory exists");
			}else {
				Path createNewPath = Files.createDirectories(p);
				System.out.println("New directory has created at "+createNewPath);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
