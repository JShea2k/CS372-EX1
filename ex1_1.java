import java.util.Scanner;
public class ex1_1 {
    public static void main(String[] args) {
        System.out.println("Please enter a number between 10 and 100 ");
        Scanner input = new Scanner(System.in);
        int userNum = input.nextInt();
        for(int i = 0; i < userNum; i++) {
			if(i % 2 == 0) 
				System.out.println(i + " is even. ");
			else
				System.out.println(i + " is odd. ");
    }
}
}