import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		String terminate = "y";
		String title = "";
		String rating = "";
		int ticketsSold = 0;
		Scanner scan = new Scanner(System.in);
		Movie m1 = new Movie();
		do
		{
		System.out.println("Enter the title of the movie");
		title = scan.nextLine();
		m1.setTitle(title);
		System.out.println("Enter the rating of the movie");
		rating = scan.nextLine();
		m1.setRating(rating);
		System.out.println("Enter the amount of tickets sold for the movie");
		ticketsSold = scan.nextInt();
		scan.nextLine();
		m1.setSoldTickets(ticketsSold);		
		System.out.println(m1.toString());
		System.out.println("Do you want to continue? (y or n)");
		terminate = scan.nextLine();
		}
		while(terminate.equals("y"));
		scan.close();
		
		
}

}