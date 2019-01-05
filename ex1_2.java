import java.util.Scanner;
public class ex1_2 {
    public static void main(String[] args) {
		final double PI = 3.14;
		System.out.println("Please enter the radius of a circle: ");
		Scanner input = new Scanner(System.in);
		double userRadius = input.nextInt(); 
		double circArea = userRadius * userRadius * PI;
		System.out.println("The area of a circle with radius " + userRadius + " is " + circArea);
	}
}