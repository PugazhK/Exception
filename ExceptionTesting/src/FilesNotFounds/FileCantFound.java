package FilesNotFounds;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileCantFound {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try {
			File f = new File("");
			FileReader fr = new FileReader(f);

			int temp = 0;
			while ((temp = fr.read()) != -1) {
				System.out.println((char) (temp));
			}
		} catch (FileNotFoundException fe) {
			System.out.println(fe + "unknown file");
		} finally {
			System.out.println("rest of the code will get executed");
		}

	}
}
