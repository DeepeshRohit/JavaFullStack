import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Java11Four {
	
	public static void main(String[] args) throws IOException {
	var path="C:\\Users\\derohit\\Desktop\\csd.txt";
	String regex = "\\s+";
     String data=Files.readString(Path.of(path));
     String[] strSplit = data.split(regex);
     
     System.out.println("Word count is " + strSplit.length);
     System.out.println(data);
     
	}
}
