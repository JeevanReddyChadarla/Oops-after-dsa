package _4_filesHandlingIO;

import java.io.File;

public class IO_5_OtherMethods {

	public static void main(String[] args) {
		File f = new File("filename.txt");
		File f2 = new File("filename2.txt"); 
		if(f.exists()) {
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.getName());
			System.out.println(f.length());
			System.out.println(f.compareTo(f2)); // compares the file names
		}else {
			System.out.println("File not found");
		}
	}

}
