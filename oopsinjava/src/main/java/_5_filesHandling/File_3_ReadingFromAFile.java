package _5_filesHandling;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class File_3_ReadingFromAFile {
//1. pass the url of the file
//2. create a list of strings = files.readAllLines(url)
	
	public static void main(String[] args) {
		try {
			Path p = Paths.get("DataSet/poem.txt");
			List<String> dataInsideFile = Files.readAllLines(p);
			for(String data : dataInsideFile) {
				System.out.println(data);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
