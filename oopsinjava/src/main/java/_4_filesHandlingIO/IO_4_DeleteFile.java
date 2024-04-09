package _4_filesHandlingIO;

import java.io.File;

public class IO_4_DeleteFile {

	public static void main(String[] args) {
		File f = new File("filename.txt");
		if(f.exists()) {
			f.delete();
			System.out.println("Deleted successfully");
		}else {
			System.out.println("file not found");
		}

	}

}
