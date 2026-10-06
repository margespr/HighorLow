import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random gen = new Random();

        int secret = gen.nextInt(10) + 1;
        int guess = 0;
        boolean done = false;
        String trash;

        do {
            System.out.print("Guess a number (1–10): ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();

                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("Guess must be between 1 and 10.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid: " + trash);
            }
        } while (!done);

        System.out.println("The number was: " + secret);

        if (guess > secret) {
            System.out.println("Too high!");
        } else if (guess < secret) {
            System.out.println("Too low!");
        } else {
            System.out.println("On the money!");
        }
    }
}
