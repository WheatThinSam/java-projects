import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileCreaterTestFinal {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Ruben\\Desktop\\file.txt");
		
		try {
			FileReader reader = new FileReader(file);
			
			System.out.println(file.getName() + " exists.");
			
		} catch(FileNotFoundException fnfe) {
			System.out.println(file.getName() + " was not found.");
		}
	}
}