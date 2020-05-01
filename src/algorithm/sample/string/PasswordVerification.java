package algorithm.sample.string;

import java.util.Random;
import java.util.Scanner;

public class PasswordVerification {
	

	public static void main(String[] args) {	
		
		//Question one
		String password="1136";
		System.out.println("Please, enter the password:");
		Scanner scanner=new Scanner(System.in);
		String user_password=scanner.next();
		if(password.equals(user_password))
			System.out.println("Login successful!");
		else
			System.out.println("Login failed!");
		
	}

}

