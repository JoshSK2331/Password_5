import java.util.Scanner;

public class starter{
	public static void main(String args[]){
		String Password="psvm";
		int Counter=0;
		Scanner Attempts=new Scanner(System.in);
		while(Counter<5){
			System.out.print("Please enter your password (attempts left: "+(5-Counter)+"): ");
			if(Password.equals(Attempts.nextLine().trim())){
				System.out.println("\nlogin correct!\n");
				break;
			}
			System.out.println("\nlogin incorrect\n");
			Counter++;
		}
	}
}
