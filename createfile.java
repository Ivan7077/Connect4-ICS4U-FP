import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createfile{
	
	public static void main(String[]args){
		try {
			File myObj = new File("D:\\FileHandling\\Connect Four History.txt");
			if(myObj.createNewFile()) {
				System.out.println("File created:" + myObj.getName());
				FileWriter myWriter = new FileWriter("D:\\FileHandling\\Connect Four History.txt");
				myWriter.write("win the game");
				myWriter.close();
				System.out.println("Successfully wrote to the file.");

			}else {
				System.out.println("File already exists.");
			}
		}catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		
	}
}
