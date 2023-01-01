package ScannerLearning;

import java.util.Scanner;

public class ScannerTesting {
	public static void main(String[] args) {
//		Scanner x = new Scanner(System.in);
//		System.out.println("Enter you name : " );
		
		  Scanner in = new Scanner(System.in);  
          System.out.print("Enter your name: ");  
          String name = in.nextLine();  
          System.out.println("Name is: " + name);             
          in.close(); 
          
          
	}
}
