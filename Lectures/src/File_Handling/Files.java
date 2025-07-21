package File_Handling;

/*
Common Methods of File Class
Method	Description
createNewFile()	Creates a new empty file
exists()	Checks if the file exists
getName()	Returns file name
getAbsolutePath()	Returns the absolute file path
length()	Returns file size in bytes
delete()	Deletes the file
mkdir()	Creates a directory
mkdirs() Creates sub folders in the directory
 */


/*
Stream is a sequence of data in two forms
1.Byte
2.Character(Uni code)

Java perform input output through this stream

It is the abstraction(hides complexity) that java provides

This stream is linked to an input output device like keyboard or mouse

Java implements these within class hierarchy in java.io package

Types of Streams in Java
1.Byte Stream - Handle binary data
2.Character(Uni-code characters) Stream - Handle text data

Byte Stream-  Two classes which are used to input data
1. Input Stream - To read from File (has an abstract method "read")
2. Output Stream -  To write into file

These both extend the Object class ,and they are abstract classes
Any class ending with Input Stream OR Output Stream Or Stream it is used for byte data
When we are working with image, pdf , etc.

Character Stream-
1. Reader
2. Writer

They are abstract class
Any class ending with reader and writer are used for uni-code or character data
When we are working with character


IOException → General input/output error.

FileNotFoundException → If a file is missing.

EOFException → If the end of a file is reached unexpectedly.





Predefined Streams in Java-

1. System.out --> Standard output Stream --> Console    <-- By default
2. System.err --> Standard Error --> Console
3. System.in --> Standard Input Stream --> Keyboard

System.out and System.err are instances of PrintStream (which extends OutputStream).

System.in is an instance of InputStream.

Since they are all ending with stream so they are all byte stream


Classes that implement the AutoCloseable interface (like FileReader, BufferedReader) can be used in try-with-resources to close automatically

 */

import java.io.File;
import java.io.IOException;

public class Files {

    public static void main(String[] args) throws IOException {

        File file = new File("example.txt");  // If we do not give a complete path then it will create a file in the current directory
        // To create a file which runs on all operating system then we should use \\ to show the path (src\\example.txt)
        // File name is case-sensitive but the path is not case-sensitive


        file.createNewFile();   // This will create an Exception so we have to throws a IOException either by giving it in method name or by try and catch block
        System.out.println("File Created");  // This function return a boolean value. It returns true when the file does not exist and it creates a new one ,but it returns false when the file already exist


        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());

        File f = new File("File_Handling_Folder\\file\\newfile");

//        if(f.mkdir()) {  // This function is used to make a directory(folder)
//            //It returns true(successfully creating of directory) otherwise false
//            System.out.println("Folder Created");
//        }
//        else{
//            System.out.println("Folder Already Exist");
//        }

        if(f.mkdirs()){   // This function will also create subfolder in the directory     (mkdirs --> make directories)
            System.out.println("File Created");
        }
        else{
            System.out.println("File Not Created");
        }

    // To check the operating system
    String OS = System.getProperty("os.name").toLowerCase();   // it is optional to use lower case
        System.out.println(OS);

//        String name = System.getProperty("os.name");

        if(OS.indexOf("windows")>=0){
            System.out.println("Windows");
        }
        else if(OS.indexOf("mac")>=0){
            System.out.println("Mac");
        }
        else{
            System.out.println("Linux");
        }
    }





}



/*
 In Java , Streams are automatically created for us. All these streams are attached with console.

 1.System.out: Output Stream
 2.System.in: Input Stream
 3.System.err: Error Stream



 File handling in Java allows you to create, read, update, and delete files using classes from the java.io and java.nio.file packages. Below are the key operations related to file handling in Java.

1. Creating a File
To create a new file, use the File class and its createNewFile() method.

java
Copy
Edit
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("example.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
2. Writing to a File
Use the FileWriter class to write data into a file.

java
Copy
Edit
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a test file.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
3. Reading from a File
Use the Scanner class to read data from a file.

java
Copy
Edit
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("example.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
4. Appending to a File
Use FileWriter in append mode (true parameter).

java
Copy
Edit
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt", true);
            writer.write("\nThis is an appended line.");
            writer.close();
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
5. Deleting a File
Use the delete() method of the File class.

java
Copy
Edit
import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myFile = new File("example.txt");
        if (myFile.delete()) {
            System.out.println("Deleted the file: " + myFile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
6. Checking File Information
Retrieve file properties such as name, path, and size.

java
Copy
Edit
import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File myFile = new File("example.txt");
        if (myFile.exists()) {
            System.out.println("File name: " + myFile.getName());
            System.out.println("Absolute path: " + myFile.getAbsolutePath());
            System.out.println("Writable: " + myFile.canWrite());
            System.out.println("Readable: " + myFile.canRead());
            System.out.println("File size in bytes: " + myFile.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
7. Using BufferedReader and BufferedWriter
Efficient reading and writing using buffering.

Reading with BufferedReader
java
Copy
Edit
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
Writing with BufferedWriter
java
Copy
Edit
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt", true))) {
            writer.write("\nThis is a buffered writer example.");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
8. Using NIO for File Operations
The java.nio.file package provides modern file handling capabilities.

Reading a file with Files.readAllLines()
java
Copy
Edit
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class NIOReadExample {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("example.txt"));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
Writing to a file using Files.write()
java
Copy
Edit
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Arrays;

public class NIOWriteExample {
    public static void main(String[] args) {
        try {
            Files.write(Paths.get("example.txt"), Arrays.asList("Hello, NIO!"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
Summary of Java File Handling Classes
Class	Description
File	Represents file and directory pathnames
FileWriter	Writes character data to a file
FileReader	Reads character data from a file
BufferedWriter	Writes text to a file efficiently
BufferedReader	Reads text from a file efficiently
Files (NIO)	Provides utility methods for file handling
Paths (NIO)	Helps in defining file paths

 */
