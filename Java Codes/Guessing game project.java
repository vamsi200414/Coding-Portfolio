import java.util.*;
public class Randomnumber {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		Random random = new Random();
		int guessthenumber = random.nextInt(10) + 1;
		int userguess = 0;
		System.out.println("welcome to the guessing game : ");
		while(userguess != guessthenumber) {
			System.out.println("guess a number : 5");
			userguess = abc.nextInt();
			if(userguess > guessthenumber) {
				System.out.println("too high");
			}
			else if(userguess < guessthenumber) {
				System.out.println("too low");
			}
			else {
				System.out.println("Guessed correctly");
			}
		}

	}

}
