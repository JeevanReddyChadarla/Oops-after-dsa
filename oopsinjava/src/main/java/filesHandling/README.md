Files are handled in java using - java.nio pacakge
we can perform - 
#### create a folder
#### create a file
#### read from a file
#### write to a file
#### append the content to an existing file
#### copy or move a file from one location to other

#### 1. Create a folder
```
Path p = Paths.get("DataSet");
Path createNewPath = Files.createDirectories(p);
```
#### 2. Create a file
```
Path p = Paths.get("DataSet/poem.txt");
Path createNewPath  = Files.createFile(p);
```
#### 3. Read from a file
```
Path p = Paths.get("DataSet/poem.txt");
List<String> dataInsideFile = Files.readAllLines(p);
```
#### 4. Write to a file 
```
Path p = Paths.get("DataSet/newfile.txt");
Path file = Files.createFile(p);
String content = "I love csk to play with dhoni";
Files.write(file, content.getBytes());
```
#### 5. Copy or move a file 
```
Path source = Paths.get("restAPI.zip");
Path destination  = Paths.get("DataSet/copied1.zip");
Files.copy(source, destination);
```
### Using java io package
We also have a old way of handling files using java.io package
in java.io package we can - 
#### create a file
#### write to a file
#### read from a file
#### delete a file

#### 1. create a file 
```
File myObj = new File("filename.txt");
myObj.createNewFile() - return true or false
```
#### 2. write to a file
```
FileWriter myContent = new FileWriter("filename.txt");
myContent.write("Hello this my content");
myContent.close();
```
#### 3. read from a file
```
File myObj = new File("filename.txt");
	Scanner myReader = new Scanner(myObj);
	while(myReader.hasNextLine()) {
		String data = myReader.nextLine();
		System.out.println(data);
	}
	myReader.close();
```
#### 4. delete a file
```
f.delete();
```

###
There are two types of file readers in java - <br>
1. byte stream  2. character stream <br>
Byte stream is divided into - data as bytes, it can be text/images/audio <br>
	1. inputstream - reading data from source files <br>
 	2. outputstream - writing data to destination files <br>
Character stream is divided into - data as characters only <br>
	1. reader - read text data from source files <br>
 	2. writer - write text data to various files <br>

