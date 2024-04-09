package filesHandlingIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Syntax - 
//File myObj = new File("filename.txt");
//	Scanner myReader = new Scanner(myObj);
//	while(myReader.hasNextLine()) {
//		String data = myReader.nextLine();
//		System.out.println(data);
//	}
//	myReader.close();

public class IO_3_ReadFromFile {

	public static void main(String[] args) {
		File myObj = new File("filename.txt");
		try {
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
