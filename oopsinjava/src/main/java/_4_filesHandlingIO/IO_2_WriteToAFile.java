package _4_filesHandlingIO;

import java.io.FileWriter;

//Syntax - 
// FileWriter myContent = new FileWriter("filename.txt");
//myContent.write("Hello this my content");
//myContent.close();
public class IO_2_WriteToAFile {

	public static void main(String[] args) {
		try {
			FileWriter myContent = new FileWriter("filename.txt");
			myContent.write("Hello this my content");
			myContent.close();
			System.out.println("Successfully closed the writer");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
