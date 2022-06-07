import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class fileHandleing {
	public static void main(String[] args) {
		read();
	}
	
	public static void create() {
		try {
			File myObj = new File("Connect Four History.txt");
			if(myObj.createNewFile()) {
				System.out.println("File created:" + myObj.getName());
				

			}else {
				System.out.println("File already exists.");
			}
		}catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		
	}
	
	public static void write() {
		try {
			FileWriter myWriter = new FileWriter("Connect Four History.txt");
			myWriter.write("win the game");
			myWriter.close();
			System.out.println("Save Successful");
		}catch (IOException e) {
			System.out.println("An error occured");
		}
	}
	
	
	public static void read() {
		try {
			File myObj = new File("Connect Four History.txt");
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
