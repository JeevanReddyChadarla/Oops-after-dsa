package filesHandlingIO;

import java.io.File;

// Syntax - 
// File myObj = new File("filename.txt");
// myObj.createNewFile() - return true or false
public class IO_1_CreateFile {

	public static void main(String[] args) {
		try {
			File myObj = new File("filename.txt");
			if(myObj.createNewFile()) {
				System.out.println("New file has created "+myObj.getName());
			}else {
				System.out.println("File already present");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
