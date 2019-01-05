import java.util.Scanner;
public class ex1_3 {
	public static void main(String[] args) {
		System.out.println("Please enter a number: ");
		Scanner input = new Scanner(System.in);
		String user_num = input.next();
		int num = user_num.charAt(0);
		System.out.println(num);
		if(num >57)
			System.out.println("Please enter a number instead. ");
		else if (num < 48)
			System.out.println("Please enter a number instead. ");
		else
			System.out.println("Thank you! "); 
	}
}