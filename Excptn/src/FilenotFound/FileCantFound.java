package FilenotFound;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileCantFound {
	
	public static void main(String[] args) throws IOException{
		try {
		File f = new File("C:\\Users\\Dell\\Documents\\hih.txt");
		FileReader fr = new FileReader(f);
		
		int temp = 0;
		while((temp = fr.read())!= -1) {
			System.out.print((char)(temp));
		}
		}catch(Exception e) {
			System.out.println(" ");
			System.out.println("Unknown file");
			e.printStackTrace();
		}finally {
			System.out.println(" ");
			System.out.println("rest of the code will continue");
		}
	}
	
}
