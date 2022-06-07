import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class Readfile {
	public static void main(String[] args) {
		try {
			File myObj = new File("D:\\FileHandling\\Connect Four History.txt");
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}catch(FileNotFoundException e) {
			System.out.println("An error occurred");
			
		}
	}

}
