Files are handled in java using - java.nio pacakge
we can perform - 
### create a folder
### create a file
### read from a file
### write to a file
### append the content to an existing file
### copy or move a file from one location to other

#### 1. Create a folder
Path p = Paths.get("DataSet");
Path createNewPath = Files.createDirectories(p);

#### 2. Create a file 
Path p = Paths.get("DataSet/poem.txt");
Path createNewPath  = Files.createFile(p);

#### 3. Read from a file 
Path p = Paths.get("DataSet/poem.txt");
List<String> dataInsideFile = Files.readAllLines(p);

#### 4. Write to a file 
Path p = Paths.get("DataSet/newfile.txt");
Path file = Files.createFile(p);
String content = "I love csk to play with dhoni";
Files.write(file, content.getBytes());

#### 5. Copy or move a file 
Path source = Paths.get("restAPI.zip");
Path destination  = Paths.get("DataSet/copied1.zip");
Files.copy(source, destination);
