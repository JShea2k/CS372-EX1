import java.util.Scanner;
public class ex1_4 {
	public static void main(String[] args) {
		System.out.println("Please enter your weight in pounds followed by your height in inches: ");
		Scanner input = new Scanner(System.in);
		int userWeight = input.nextInt();
		int userHeight = input.nextInt();
		double weight = userWeight * 0.4536;
		double height = userHeight * 0.0254;
		double BMI = weight * height * height;
		System.out.println("Your BMI is " + BMI + " in kg/m^2.");
	}
}