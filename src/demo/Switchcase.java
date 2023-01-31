package demo;

import java.util.Scanner;

public class Switchcase {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the login id ");
		String Searchbox = s.next();
		
		switch (Searchbox) {
		case "username":
			System.out.println("Ganeshmoorthy");
			
			break;
		case "Passwoord":
			System.out.println("XYZ");
			
			break;
			
		default:
			System.out.println("Invalid username/passward");
		}
	}

}
