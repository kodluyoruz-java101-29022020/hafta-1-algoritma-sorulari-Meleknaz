import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args) {
		
		//Question two
				Scanner scanner=new Scanner(System.in);
				System.out.println("Please, enter two numbers:");
				int number1=scanner.nextInt();
				int number2=scanner.nextInt();
				System.out.println("Menu:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
				System.out.println("Your choice:");
				int choice=scanner.nextInt();
				
				switch (choice) {
				case 1:
					System.out.println(number1+number2);
					break;
				case 2:
					if(number1>number2)
					System.out.println(number1-number2);
					else
				    System.out.println(number2-number1);
					break;
				case 3:
					System.out.println(number1*number2);
					break;
				case 4:
					System.out.println((double)number1/(double)number2);
					break;
				default:
					System.out.println("Select a number between 1 and 4.");
					break;
				}

				
	}

}
