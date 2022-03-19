package practice;

import java.util.Scanner;

public class Testing {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Commented Out
		
		System.out.println("Hello");
		System.out.println("Test");
		
		//Scanner class to accept input
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("What is your name? \nEnter below: \n");
		String input = sc.nextLine();
		
		System.out.println("Hello " + input);
		
		//Sleep Function:
		
		try
		{
		    Thread.sleep(10000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		
		//Sleep Function test:
		
		System.out.println("Thank you for waiting" + input);
		
		//Alternative:
		
		System.out.println("Before Test");
		
		try {
			
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After Test");
		
		//End alternative method
		
	}

}
