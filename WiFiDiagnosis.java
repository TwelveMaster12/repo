/*
* Class: CMSC203
* Instructor:
* Description: (Give a brief description for each Class)
* Due: 2/09/2021
* Platform/compiler: Eclipse IDE	
* I pledge that I have completed the programming assignment
independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Print your Name here: Frank Deegbe
*/


import java.util.Scanner;

public class WiFiDiagnosis {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String question;
		
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
		System.out.println("First step: reboot your computer\r\n" + "Are you able to connect with the internet? (yes or no)");
		
		question = scan.nextLine();
		
		if(question.equals("yes"))
			System.out.println("Rebooting your computer seemed to work");
		if(question.equals("no")) 
		{
			System.out.println("Second step: reboot your router\r\n" + "Now are you able to connect with the internet? (yes or no)");
			question = scan.nextLine();
			if(question.equals("yes"))
				System.out.println("Rebooting your router seemed to work");
			if(question.equals("no"))
			{
				System.out.println("Third step: make sure the cables to your router are plugged in firmly " + "and your router is getting power\r\n" + "Now are you able to connect with the internet? (yes or no)");
				question = scan.nextLine();
				if(question.equals("yes"))
					System.out.println("Checking the router's cables seemed to work");
				if(question.equals("no"))
				{
					System.out.println("Fourth step: move your computer closer to your router\r\n" + "Now are you able to connect with the internet? (yes or no)");
					question = scan.nextLine();
					if(question.equals("yes"))
						System.out.println("Moving your computer seemed to work");
					if(question.equals("no"))
						System.out.println("Fifth step: contact your ISP\r\n" + "Make sure your ISP is hooked up to your router.\r\n");	
				}
			}
				
		}
	}
}