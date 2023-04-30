import java.util.Scanner;
import java.util.Random;
public class guess {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    int maxNum = 100;
    int Number = random.nextInt(maxNum) + 1;
    int numberofattempts = 0;

    System.out.println("Guess the number between 1 and " + maxNum + ".");

    while (!false) {
      System.out.print("Enter your guess: ");
      int guess = input.nextInt();
      numberofattempts++;

      if (guess == Number) {
        System.out.println("Congratulations! You guessed the number in " + numberofattempts + " attempts.");
        break;
      } else if (guess < Number) {
        System.out.println("Your guess is too low. Try again.");
      } else {
        System.out.println("Your guess is too high. Try again.");
      }
    }
  }
}