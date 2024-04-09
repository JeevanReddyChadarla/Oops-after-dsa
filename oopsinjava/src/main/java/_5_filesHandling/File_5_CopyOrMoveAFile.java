package _5_filesHandling;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class File_5_CopyOrMoveAFile {

	public static void main(String[] args) {
		try {
			System.out.println("Started at : "+new Date());
			Path source = Paths.get("restAPI.zip");
			Path destination  = Paths.get("DataSet/copied1.zip");
//			Files.copy(source, destination);
			Files.move(source, destination); //-- this is to move the file
			System.out.println("Completed : "+new Date());
		} catch (Exception e) {
			System.out.println("Exception occurred");
		}

	}

}
